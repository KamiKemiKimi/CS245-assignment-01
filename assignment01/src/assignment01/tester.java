package assignment01;
import java.util.Random;

public class tester{
	public static void main(String [] args)
	{
		Random rand = new Random();
		
		double [] arr1 = new double[50000];
	
		for(int i = 0; i < 50000; i++)
		{
			double randint = rand.nextDouble();
			arr1[i] = randint;
		}
		double [] arr2 = arr1.clone();
		double [] arr3 = arr1.clone();
		double [] arr4 = arr1.clone();
		double [] arr5 = arr1.clone();
		
		double [] arr6 = new double[100000];
		
		for(int i = 0; i < 100000; i++)
		{
			double randint = rand.nextDouble();
			arr6[i] = randint;
		}
		double [] arr7 = arr6.clone();
		double [] arr8 = arr6.clone();
		double [] arr9 = arr6.clone();
		double [] arr10 = arr6.clone();
		
		double [] arr11 = new double[150000];
		
		for(int i = 0; i < 150000; i++)
		{
			double randint = rand.nextDouble();
			arr11[i] = randint;
		}
		
		double [] arr12 = arr11.clone();
		double [] arr13 = arr11.clone();
		double [] arr14 = arr11.clone();
		double [] arr15 = arr11.clone();
		
		double [] arr16 = new double[200000];
		
		for(int i = 0; i < 200000; i++)
		{
			double randint = rand.nextDouble();
			arr16[i] = randint;
		}
		
		double [] arr17 = arr16.clone();
		double [] arr18 = arr16.clone();
		double [] arr19 = arr16.clone();
		double [] arr20 = arr16.clone();
		
		double [] arr21 = new double[250000];
		
		for(int i = 0; i < 250000; i++)
		{
			double randint = rand.nextDouble();
			arr21[i] = randint;
		}
		double [] arr22 = arr21.clone();
		double [] arr23 = arr21.clone();
		double [] arr24 = arr21.clone();
		double [] arr25 = arr21.clone();
		
		double [] arr26 = new double[300000];
		
		for(int i = 0; i < 300000; i++)
		{
			double randint = rand.nextDouble();
			arr26[i] = randint;
		}
		double [] arr27 = arr26.clone();
		double [] arr28 = arr26.clone();
		double [] arr29 = arr26.clone();
		double [] arr30 = arr26.clone();
		
		double [] arr31 = new double[350000];
		
		for(int i = 0; i < 350000; i++)
		{
			double randint = rand.nextDouble();
			arr31[i] = randint;
		}
		double [] arr32 = arr31.clone();
		double [] arr33 = arr32.clone();
		double [] arr34 = arr33.clone();
		double [] arr35 = arr34.clone();
		
		double [] arr36 = new double[400000];
		
		for(int i = 0; i < 400000; i++)
		{
			double randint = rand.nextDouble();
			arr36[i] = randint;
		}
		double [] arr37 = arr36.clone();
		double [] arr38 = arr36.clone();
		double [] arr39 = arr36.clone();
		double [] arr40 = arr36.clone();
		
		double [] arr41 = new double[450000];
		
		for(int i = 0; i < 450000; i++)
		{
			double randint = rand.nextDouble();
			arr41[i] = randint;
		}
		double [] arr42 = arr41.clone();
		double [] arr43 = arr41.clone();
		double [] arr44 = arr41.clone();
		double [] arr45 = arr41.clone();
		
		double [] arr46 = new double[500000];
		
		for(int i = 0; i < 500000; i++)
		{
			double randint = rand.nextDouble();
			arr46[i] = randint;
		}
		double [] arr47 = arr46.clone();
		double [] arr48 = arr46.clone();
		double [] arr49 = arr46.clone();
		double [] arr50 = arr46.clone();
		
		
		
		time(arr1, arr2, arr3, arr4, arr5);
		time(arr6, arr7, arr8, arr9, arr10);
		time(arr11, arr12, arr13, arr14, arr15);
		time(arr16, arr17, arr18, arr19, arr20);
		time(arr21, arr22, arr23, arr24, arr25);
		time(arr26, arr27, arr28, arr29, arr30);
		time(arr31, arr32, arr33, arr34, arr35);
		time(arr36, arr37, arr38, arr39, arr40);
		time(arr41, arr42, arr43, arr44, arr45);
		time(arr46, arr47, arr48, arr49, arr50);
		
	}
	
	static void time(double [] arr, double [] arr1, double [] arr2, double [] arr3, double [] arr4)
	{
		System.out.println(arr.length + " ");
		System.out.println("------");
	
		//bubble sort
		bubble bubbletest = new bubble();
		long start = System.currentTimeMillis();
		bubbletest.sort(arr);
		long end = System.currentTimeMillis();
		System.out.println("bs: " + (end-start) + "milliseconds");
		
		//selection sort
		selection selectiontest = new selection();
		long start1 = System.currentTimeMillis();
		selectiontest.sort(arr1);
		long end1 = System.currentTimeMillis();
		System.out.println("ss: " + (end1-start1) + "milliseconds");
		
		//insertion sort
		insertion insertiontest = new insertion();
		long start2 = System.currentTimeMillis();
		insertiontest.sort(arr2);
		long end2 = System.currentTimeMillis();
		System.out.println("is: " + (end2-start2) + "milliseconds");
		
		//quick sort
		quicksort quicksorttest = new quicksort();
		long start3 = System.currentTimeMillis();
		quicksorttest.quickSort(arr3, 0, arr3.length-1);
		long end3 = System.currentTimeMillis();
		System.out.println("qs: " + (end3-start3) + "milliseconds");
		
		//merge sort
		merge mergetest = new merge();
		long start4 = System.currentTimeMillis();
		mergetest.mergeSort(arr4, arr4.length);
		long end4 = System.currentTimeMillis();
		System.out.println("ms: " + (end4-start4) + "milliseconds");
	}
}
