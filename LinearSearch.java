package Exercises;

class LinearSearch
{
	static int index;
  static int doSearchUnsorted(int[] arrayData, int searchValue)
  {
    for (int i = 0; i < arrayData.length; i++) {
    	index = -1;
    	if(arrayData[i] == searchValue) {
    		index = i;
    		break;
    	}
    	
    }
    return index; 
  }
  
  public static void main(String[] args)
  {
    int[] arrayData = new int[] { 2, 8, 15, -2, 31, 4, 1};
    
    System.out.format("doSearch(5) = %d", doSearchUnsorted(arrayData, 5));
    System.out.format("doSearch(31) = %d", doSearchUnsorted(arrayData, 31));
  }
}