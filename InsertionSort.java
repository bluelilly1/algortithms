package Exercises;

class InsertionSort {
	  static void DoSort(int[] array)
	  {
		  for (int index = 1; index < array.length;index++) {
			 int val = array[index];
			 int j = index;
			  while ( j > 0 && val < array[j-1] ) {
				 
				  array[j] = array[j-1];
				  j--;
			  }
			 array[j] = val;
		  }
	  }
	  
	  public static void main(String[] args)
	  {
	     int[] array = new int[] {10, 12, 4, 18, 32, 3, 9};

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();

	     DoSort(array);

	     for (int x : array)
	     {
	         System.out.format("%d ", x);
	     }
	     System.out.println();
	  }
	}