package assignment01part2;

import java.util.Random;

//req 4
public class hybridqs {
	public static void main(String [] args)
	{
		Random rand = new Random();
		
		double [] test = new double[5000];
	
		for(int i = 0; i < 5000; i++)
		{
			double randint = rand.nextDouble();
			test[i] = randint;
		}
		
		//FOR MY REFERENCE -- 21 different entries
		//double [] test = {3.3, 0.1, 7.4, 4.2, 1.3, 2.3, 7.7, 
				//2.4, 1.0, 6.0, 4.4, 0.8, 4.2, 7.4, 9.9, 0.3, 5.2, 4.7, 4.0, 7.1};
		
		hybridqs go = new hybridqs();
		
		//FOR MY REFERENCE
		//for(int i = 0; i < test.length; i++)
		//{
		//	System.out.print(test[i] + "  ");
		//}
		//System.out.println();
		
		go.hybridsort(test, 0, test.length);
		
		for(int j = 0; j < test.length;j++)
		{
			System.out.println(test[j] + " ");
		}
		
	}
	
	public void hybridsort(double [] arr, int left, int right)
	{
		quadraticqs selection = new quadraticqs();
		randomizedqs quick = new randomizedqs();
		//int k = 1; FOR MY REFERENCE
		
		while (left <= right)
		{
			int pivot_index = quick.quicksort(arr, left, right-1);
			//System.out.println("pivot: " + arr[pivot_index]);
			
			if ((pivot_index) - left < 100)
			{
				selection.quadraticsort(arr, left, pivot_index+1);
				left = pivot_index+1;
				
			}
			if(right - (pivot_index) < 100)
			{
				selection.quadraticsort(arr, pivot_index+1, right);
				right = pivot_index;	
			}
			
			/***
			 * FOR MY REFERENCE
			 * 
			System.out.print("iteration " + k + " ");
			for(int j = 0; j < arr.length;j++)
			{
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
			k++;
			***/
			
		}
	}
}
