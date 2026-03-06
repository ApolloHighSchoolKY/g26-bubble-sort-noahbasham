public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum;

		//Loop once for each pass, where passes is one less than the number of items.
		for(passes = 1; passes<myNums.length; passes++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(comparisons = 0; comparisons < myNums.length-passes; comparisons++)
			{
				tempNum = myNums[comparisons + 1];
				//If they are out of order, swap the values
				if(myNums[comparisons] >= tempNum)
				{
					myNums[comparisons + 1] = myNums[comparisons];
					myNums[comparisons] = tempNum;
				}
			//End Loop for comparisons
			}
			//The next pass will use one less comparison
    
		//End Loop for passes
		}
		for(int x: myNums)
			System.out.println(x);

  }
}
