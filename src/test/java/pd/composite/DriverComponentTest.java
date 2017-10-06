package pd.composite;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DriverComponentTest { 
	
	private DriverComponent root;

    private DriverComponent compt1;

    private DriverComponent compt11;

    private DriverComponent compt12;

    private DriverComponent leaf;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {    		    		
        this.root = new DriverComposite("raiz");

        this.leaf = new DriverLeaf(new Driver(1));
        this.root.add(leaf);
        this.compt1 = new DriverComposite("compt1");
        this.root.add(compt1);
        this.root.add(new DriverLeaf(new Driver(7)));

        this.compt11 = new DriverComposite("compt11"); 
        this.compt1.add(compt11);
        this.compt1.add(new DriverLeaf(new Driver(4)));
        this.compt12 = new DriverComposite("compt12");
        this.compt1.add(compt12);

        this.compt11.add(new DriverLeaf(new Driver(2)));
        this.compt11.add(new DriverLeaf(new Driver(3)));

        this.compt12.add(new DriverLeaf(new Driver(-5)));
        this.compt12.add(new DriverLeaf(new Driver(6)));
    }

    @Test
    public void testNumberOfDriverComponentsIfLeaf() { 
        assertEquals(1, this.leaf.numberOfDriversPerLeaf());
    }

    @Test
    public void testNumberOfDriverComponentsIfComposite() {
        assertEquals(3, this.root.numberOfDriversPerLeaf());
        assertEquals(2, this.compt11.numberOfDriversPerLeaf());
    }

    @Test
    public void testAddLeaf() {
        exception.expect(UnsupportedOperationException.class);
        this.leaf.add(new DriverLeaf(new Driver(2)));
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
    		assertEquals(1, this.leaf.view());
    }
    
    @Test
    public void testViewIfComposite() {
    		assertEquals(-1, this.compt1.view());
    }
    
    @Test
    public void testDriverComponentToString() {
    		assertEquals("[Hoja=1][Hoja=2][Hoja=3][compt11][Hoja=4][Hoja=-5][Hoja=6][compt12][compt1][Hoja=7][raiz]", 
    				this.root.toString()); 
    }
}
