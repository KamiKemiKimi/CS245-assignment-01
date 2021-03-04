package assignment01;

public class quicksort {

	void quickSort(double[] arr, int low, int high) 
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }
         
        if (low >= high){
            return;
        }
 
        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        double pivot = arr[middle];
 
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) 
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot) 
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot) 
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping 
            //After swapping move the iterator on both lists
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
    }
     
    void swap (double[] arr, int x, int y)
    {
        double temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
	void calculate(double [] asdf)
	{
		quicksort go = new quicksort();
		
		long start2 = System.currentTimeMillis();
		go.quickSort(asdf, 0, asdf.length-1);
		long end2 = System.currentTimeMillis();
	
		/***
		long start = System.nanoTime();
		// some time passes
		long end = System.nanoTime();
		long elapsedTime = end - start; 
		***/
		
		System.out.println("qs: " + (end2-start2) + "milliseconds");
	}
}
