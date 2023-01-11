package in.neuron.main;

public class BS {
	static void print (int []a)
	{
		int n = a.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	static void bubbleSort (int []a)
	{
		int n=a.length;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[j] < a[i])
				{
					int temp = a[i];
					a[i] =a[j];
					a[j] = temp;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args)
	{
		int []a = {55,-6,58,24,9,67,98,85};
		BS b1 = new BS();
		System.out.println("Before sorting Elemensts are - ");
		b1.print(a);
		b1.bubbleSort(a);
		
		System.out.println();
		
		System.out.println("After Sorting  Elements are -");
		b1.print(a);
		
	}
	
	
}