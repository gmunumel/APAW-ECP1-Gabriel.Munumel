package pd.strategy;

// Source: https://stackoverflow.com/a/16089042/992347

public class BubbleSort implements Strategy {

	public void sort(int[] values) {
		System.out.print("sorting array using bubble sort strategy - ");
		int n = values.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (values[j - 1] > values[j]) {
	                temp = values[j - 1];
	                values[j - 1] = values[j];
	                values[j] = temp;
	            }

	        }
	    }
    }
}
