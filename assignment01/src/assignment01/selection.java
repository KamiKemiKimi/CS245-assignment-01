package assignment01;

public class selection {

	void swap (double [] arr, int i, int j)
	{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	double[] sort (double[] arr) {
		for(int i = 0; i < arr.length-1; i++)
		{
			int smallest = i;
			for (int j = i+1; j<arr.length; j++)
			{
				if (arr[j] < arr[smallest])
					smallest = j;
			}
			swap(arr,smallest,i);
		}
		return arr;
	}
	
	void calculate(double [] asdf)
	{
		selection go = new selection();
		
		long start2 = System.currentTimeMillis();
		go.sort(asdf);
		long end2 = System.currentTimeMillis();
		
		/***
		long start = System.nanoTime();
		// some time passes
		long end = System.nanoTime();
		long elapsedTime = end - start; 
		***/
		
		System.out.println("ss: " + (end2-start2) + "milliseconds");
	}
}
