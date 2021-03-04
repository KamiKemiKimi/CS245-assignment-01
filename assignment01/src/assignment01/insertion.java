package assignment01;

public class insertion {
	void sort(double arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
        	double key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
	
	void calculate(double [] asdf)
	{
		insertion go = new insertion();
		
		long start2 = System.currentTimeMillis();
		go.sort(asdf);
		long end2 = System.currentTimeMillis();
		
		System.out.println(end2-start2);
	}

}
