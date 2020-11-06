package Exercises;

class QuickSort {
	  static void DoSort(int[] array)
	  {
		  int high = array.length-1;
		  int low = 0;
		  int mid = (int) (array.length-1 /2);
		  int pivot;
		  //choose pivot
		  if (array[low] > array[mid]) {
			  int temp = array[low];
			  array[low] = array[mid];
			  array[mid] = temp;
		  }
		  if (array[mid] > array[high]) {
			  int temp = array[mid];
			  array[mid] = array[high];
			  array[high] = temp;
		  }
		  pivot = array[mid];
		  int pivotIndex = mid;
		  for (int left = 0; left < pivotIndex && array[left] <= pivot;  left++) {
			 
			  
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