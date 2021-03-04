package assignment01;

//check to see if you can switch one value to the next
public class bubble {
	
	void swap(double [] arr, int i, int j)
	{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	double [] sort (double [] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					swap(arr,j, j+1);
				}
			}
		}
		
		
		
		return arr;
	}
	
	void calculate(double [] asdf)
	{
		bubble go = new bubble();
		
		long start2 = System.currentTimeMillis();
		go.sort(asdf);
		long end2 = System.currentTimeMillis();
		
		System.out.println("bb: " + (end2-start2) + "milliseconds");
	}
}
