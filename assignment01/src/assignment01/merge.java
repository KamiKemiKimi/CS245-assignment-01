package assignment01;

public class merge {
	
	double [] mergeSort(double[] a, int n) {
	    if (n < 2) {
	        return a;
	    }
	    int mid = n / 2;
	    double[] l = new double[mid];
	    double[] r = new double[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    combine(a, l, r, mid, n - mid);
	    
	    return a;
	}
	
	void combine(double[] a, double[] l, double[] r, int left, int right) { 
		    int i = 0, j = 0, k = 0;
		    while (i < left && j < right) {
		        if (l[i] <= r[j]) {
		            a[k++] = l[i++];
		        }
		        else {
		            a[k++] = r[j++];
		        }
		    }
		    while (i < left) {
		        a[k++] = l[i++];
		    }
		    while (j < right) {
		        a[k++] = r[j++];
		    }
	}

	
}
