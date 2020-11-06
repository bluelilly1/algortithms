package Exercises;

class ReverseArray {
	  static void DoReverse(int[] array)
	  {
		  int right  = array.length-1;
		  int left = 0;
		  while (left < right) {
			  int temp = array[left];
			  array[left] = array[right];
			  array[right] = temp;
			  right--;
			  left++;
		  }
	  }
	  
	  public static void main(String[] args)
	  {
	     int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();

	     DoReverse(array);

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();
	  }
	}