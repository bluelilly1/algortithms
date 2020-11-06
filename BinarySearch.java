package Exercises;

class BinarySearch
{
  static int doBinarySearch(int[] arrayData, int searchValue)
  {
    int index = -1;
    int left = 0;
    int right = arrayData.length;
    while (left <= right) {
    	int mid = (left + right) /2;
    	if (arrayData[mid] == searchValue) {
    		index = mid;
    		break;
    	}
    	else if (arrayData[mid] > searchValue) {
    		right = mid + 1;
    	}
    	else {
    		left = mid - 1;
    	}
    }
    return index;
  }
  
  public static void main(String[] args)
  {
    int[] arrayData = new int[] { 2, 8, 15, 22, 31, 44, 51};
    
    System.out.println("doBinarySearch(5) = " + String.valueOf(doBinarySearch(arrayData, 5)));
    System.out.println("doBinarySearch(31) = " + String.valueOf(doBinarySearch(arrayData, 31)));
    
  }
}