package in.neuron.main;

public class MergeSort 
{
	
    void conquer(int []arr, int si, int mid, int ei)
	{
		int merged[] = new int[ei-si+1];
		
		int idx1 = si;
		int idx2 = mid+1;
		int x=0;
		
		while(idx1 <= mid && idx2 <= ei)
		{
			if(arr[idx1] <= arr[idx2])
			{
				merged[x++] = arr[idx1++];
				//x++;
				//idx1++;
			}
			else
			{
				merged[x++] = arr[idx2++];
			}
		}
		while(idx1 <= mid)
		{
			merged[x++] = arr[idx1++];
		}
		while(idx2 <= ei)
		{
			merged[x++] = arr[idx2++];
		}
		
		
		for(int i=0, j=si; i<merged.length; i++, j++)
		{
			arr[j] = merged[i];
		}
	}

	
	
    void divide(int []arr, int si, int ei)
	{
		if(si<ei)
		{
	    int mid = si + (ei - si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conquer(arr, si, mid, ei);
		}
		
	}
    
    void printArray(int []arr)
    {
    	int n=arr.length;
    	for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
    }

	public static void main(String[] args) 
	{
		int []arr = {65,65,89,-8,21,6,-85,25};
		int n= arr.length;
		MergeSort m1 = new MergeSort();
		m1.divide(arr, 0, n-1);
		System.out.println("After sorting array elements are -");
	    m1.printArray(arr);
		
		System.out.println();		
		

	}

}
