package pd.strategy;

// Source: https://stackoverflow.com/a/8362713/992347

public class SelectionSort implements Strategy {

	public void sort(int[] values) { 
		System.out.print("sorting array using selection sort strategy - ");
		int min;
	    for (int i = 0; i < values.length; i++) {
	        min = i;
	        for (int j = i + 1; j < values.length; j++) {
	            if (values[j] < values[min]) {
	                min = j;

	            }
	        }
	        if (min != i) {
	            final int temp = values[i];
	            values[i] = values[min];
	            values[min] = temp;
	        }
	    }
	}
}
