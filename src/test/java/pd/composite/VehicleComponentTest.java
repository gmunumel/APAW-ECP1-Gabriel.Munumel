package pd.composite;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VehicleComponentTest { 
	
	private VehicleComponent root;

    private VehicleComponent compt1;

    private VehicleComponent compt11;

    private VehicleComponent compt12;

    private VehicleComponent leaf;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {    		    		
        this.root = new VehicleComposite("raiz");

        this.leaf = new VehicleLeaf(new Vehicle(1L));
        this.root.add(leaf);
        this.compt1 = new VehicleComposite("compt1");
        this.root.add(compt1);
        this.root.add(new VehicleLeaf(new Vehicle(7L)));

        this.compt11 = new VehicleComposite("compt11"); 
        this.compt1.add(compt11);
        this.compt1.add(new VehicleLeaf(new Vehicle(4L)));
        this.compt12 = new VehicleComposite("compt12");
        this.compt1.add(compt12);

        this.compt11.add(new VehicleLeaf(new Vehicle(2L)));
        this.compt11.add(new VehicleLeaf(new Vehicle(3L)));

        this.compt12.add(new VehicleLeaf(new Vehicle(-5L)));
        this.compt12.add(new VehicleLeaf(new Vehicle(6L)));
    }

    @Test
    public void testNumberOfVehicleComponentsIfLeaf() { 
        assertEquals(1, this.leaf.numberOfVehiclesPerLeaf());
    }

    @Test
    public void testNumberOfVehicleComponentsIfComposite() {
        assertEquals(3, this.root.numberOfVehiclesPerLeaf());
        assertEquals(2, this.compt11.numberOfVehiclesPerLeaf());
    }

    @Test
    public void testAddLeaf() {
        exception.expect(UnsupportedOperationException.class);
        this.leaf.add(new VehicleLeaf(new Vehicle(2L)));
    }
    
    @Test
    public void testTrueIfComposite() {
    		assertEquals(true, this.compt12.isComposite());
    }
    
    @Test
    public void testFalseIfLeaf() {
    		assertEquals(false, this.leaf.isComposite());
    }
    
    @Test
    public void testViewIfleaf() {
    		assertEquals(1L, this.leaf.view(), 0);
    }
    
    @Test
    public void testViewIfComposite() {
    		assertEquals(-1L, this.compt1.view(), 0);
    }
    
    @Test
    public void testVehicleComponentToString() { 
    		assertEquals("[Hoja=1][Hoja=2][Hoja=3][compt11][Hoja=4][Hoja=-5][Hoja=6][compt12][compt1][Hoja=7][raiz]", 
    				this.root.toString()); 
    }
}
