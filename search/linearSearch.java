package search;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to be searched:- ");
        int key = sc.nextInt();

        int ans = linearSearch(arr, key);
        if (ans == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at "+ans+" index.");
        }
    }

    static int linearSearch(int[] arr, int key) {
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
