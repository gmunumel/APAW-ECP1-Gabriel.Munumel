package pd.strategy;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContextTest { 

	private static int NUMBERS = 100; 
	
	private Context ctx;
	
	private int[] arr1;
	
	private int[] arr2;
	
	@Before
	public void setUp() {   
		arr1 = new int[NUMBERS];  
	      Arrays.setAll(arr1, i -> {
				    return new Random().nextInt((NUMBERS * 2 )+ 1) - NUMBERS;
				});
	    arr2 = Arrays.copyOf(arr1, NUMBERS);
	    Arrays.sort(arr2); 
	}
	
	@Test
	public void testContextBubbleSort() {  
		ctx = new Context(new BubbleSort());
	}
	
	
	@Test
	public void testContextSelectionSort() { 
		ctx = new Context(new SelectionSort());
	}
	
	@Test
	public void testContextMergeSort() { 
		ctx = new Context(new MergeSort());
	}
	
	@Test
	public void testContextQuickSort() {
		ctx = new Context(new QuickSort());
	} 
	
	@After
	public void execute() {
		long startTime = System.currentTimeMillis();
		ctx.arrange(arr1); 
		long endTime = System.currentTimeMillis();
		assertTrue(Arrays.equals(arr2, arr1)); 
		System.out.println("tiempo ejecución: " + (endTime - startTime)); 
	}
}
