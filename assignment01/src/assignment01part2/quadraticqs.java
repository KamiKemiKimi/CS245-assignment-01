package assignment01part2;

//req 2/3
//SELECTION SORT
public class quadraticqs {

	private void swap (double [] arr, int i, int j)
	{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void quadraticsort (double [] arr, int left, int right) {
		for(int i = left; i < right-1; i++)
		{
			int smallest = i;
			for (int j = i+1; j<right; j++)
			{
				if (arr[j] < arr[smallest])
					smallest = j;
			}
			swap(arr,smallest,i);
		}
	}
	
	//to test if works
	public static void main (String [] args)
	{
		
		double [] arr = {9.3, 1.1, 0.1, 5.5, 3.2, 7.4, 2.5};
		quadraticqs go = new quadraticqs();
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		go.quadraticsort(arr, 1, 7); //not inclusive for right i.e. (1,6) is index 1 to 5
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}
