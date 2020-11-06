package Exercises;

class BubbleSort {
	  static void DoSort(int[] array)
	  {
		 
		  for (int x = 0; x < array.length; x++) {
			  for (int y = x+1; y < array.length;y++) {
				  if (array[y] > array[x]) {
					  //swap
					  int temp = array[x];
					  array[x] = array[y];
					  array[y] = temp;
					  
				  }
			  }
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
