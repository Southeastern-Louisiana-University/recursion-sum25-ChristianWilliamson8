


import java.util.Scanner;

public  static class linearSearch {
  /** The method for finding a key in the list */

  public static int linearSearch1(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i; // Key found at index i
    }
    return -1;  // Key not found
  }
}


 public  static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask for the number of elements
  System.out.print(" Enter the number of elements: ");
  int n = input.nextInt();

  int[] list = new int[n];

  // input array elements

  System.out.println("Enter " + n + " integers: ");
  for (int i = 0; i < n; i++) {
    list[i] = input.nextInt();
  }

  // input key to search

  System.out.println("Enter the key to search for:  ");
  int key = input.nextInt();

  // Perform Linear search
  int index = linearSearch.linearSearch1(list, key);

  // output results

  if (index != -1) {
    System.out.println("Key " + key + " found at index " + index + ".");

  } else {
    System.out.println("Key " + key + " not found.");
  }
  input.close();
}