package in.neuron.main;


public class QuickSort 
{
	public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i=low-1;
		
		for(int j=low; j<high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
	
	
	
	
	public static void quickSort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int pdx = partition(arr, low, high);
			
			quickSort(arr, low, pdx-1);
			quickSort(arr, pdx+1, high);
		}
	}
	
	public static void main(String[] args)
	{
		int []arr = {65,55,96,4,22,1,87,-5};
		int n=arr.length;
		
		quickSort(arr, 0, n-1);
		
		
		//print
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
		
}