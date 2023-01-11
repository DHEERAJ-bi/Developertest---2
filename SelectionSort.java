package in.neuron.main;

public class SelectionSort {
	
	
	
	void printArray(int []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int []arr = {58,6,-95,25,-6,97,32};
		
		for(int i=0; i<arr.length-1; i++)
		{
			int smallest = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < smallest)
				{
					j=smallest;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i]=temp;
		}
		
		SelectionSort S1 = new SelectionSort();
		S1.printArray(arr);

	}

}

