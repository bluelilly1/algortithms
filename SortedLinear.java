package Exercises;


class SortedLinear
{
	static int index;
  static String doSearch(int[] arrayData, int searchValue)
  {
	  index = -1;
	  for (int i = 0; i < arrayData.length; i++) {
		  if (arrayData[i] == searchValue) {
			  index = i;
			 
		  }
		  else if (arrayData[i] > searchValue) {
			  break;
		  }
	  }
    return String.valueOf(index);
  }
  
  public static void main(String[] args)
  {
    int[] arrayData = new int[] { 2, 8, 15, 22, 31, 44, 51};
    
    System.out.println("doSearch(5) = " +  doSearch(arrayData, 5));
    System.out.println("doSearch(31) = " + doSearch(arrayData, 31));
  }
}