
	import java.util.Arrays;
public class BubbleSort
{
	public static void main(String[] args)
  {
	int[] unsorted = {0, 3, 2, 5, 6, 8, 7};
    System.out.println(Arrays.toString(unsorted));
	System.out.println(Arrays.toString(bubbleSort(unsorted)));

  }

  public static int[] bubbleSort(int[] unsorted){
	int[] sorted = new int[unsorted.length];

	//set sorted equal to what is in sorted
	for(int i = 0; i<unsorted.length; i++)
	{
		sorted[i] = unsorted[i];
	}
		int passes;
		int comparisons;
		int tempNum;
		
		//Loop once for each pass, where passes is one less than the number of items.
		for(passes = 1; passes < sorted.length; passes++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(comparisons = 0; comparisons < sorted.length-passes; comparisons++)
			{
				tempNum = sorted[comparisons + 1];
				//If they are out of order, swap the values
				if(sorted[comparisons] >= tempNum)
				{
					sorted[comparisons + 1] = sorted[comparisons];
					sorted[comparisons] = tempNum;
				}
				
			//End Loop for comparisons
			}
		
		}
		return sorted;
  }
}
