package assignment01part2;
import java.util.Random;

//req 1
public class randomizedqs {
	
	void random(double arr[],int low,int high) 
    { 
     
        Random rand= new Random(); 
        int pivot = rand.nextInt(high-low)+low; 
         
        double temp1=arr[pivot];  
        arr[pivot]=arr[high]; 
        arr[high]=temp1; 
    } 
	
	int partition(double arr[], int low, int high) 
    { 

        random(arr,low,high);
        double pivot = arr[high]; 
     
 
        int i = (low-1);
        for (int j = low; j < high; j++) 
        { 

            if (arr[j] < pivot) 
            { 
                i++; 
 
                // swap arr[i] and arr[j] 
                double temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
 

        double temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
 
        return i+1; 
    } 
	
	public int quicksort (double [] arr, int left, int right)
	{

	    { 
	        if (left < right) 
	        { 

	            int pi = partition(arr, left, right);
	            //quicksort(arr, left, pi-1); 
	            //quicksort(arr, pi+1, right); 
	            return pi;
	        } 
	    }
	    return -1;
	}
	
	//to test if works
	public static void main(String args[]) 
    { 
		
		randomizedqs go = new randomizedqs();
		
        double arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
 
        System.out.println("pivot after partition = " + go.quicksort(arr, 0, n-1)); 
 
        System.out.println("Array:"); 
        go.printArray(arr); 
    } 
    void printArray(double arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}

