package in.neuron.main;

public class DuplicateElements {
	public static void main(String[] args)
	{
		int []arr= {10,250,10,55,44,889,55,65};
		
		System.out.println("Duplicate Elements has to be displayed:");
		
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				
				if(arr[i]==arr[j])
				{
		
					System.out.println(arr[j]);
				}
			}
		}
	}

}
