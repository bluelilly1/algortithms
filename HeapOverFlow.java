package Exercises;
import java.util.ArrayList;

public class HeapOverFlow {

  public static void main(String[] args)
  {
    infiniteArrayList();
  }
  public static void infiniteArrayList() {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int count = 0;
    while (count < 10) {
      arr.add(0);
    }
    System.out.println(arr);
  }
}



