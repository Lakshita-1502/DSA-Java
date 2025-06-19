package search;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int size, key, flag=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:- ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to be searched:- ");
        key = sc.nextInt();

        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                flag=1;
                break;
            }
        }

        if (flag==0) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position " + i + " in the array");
        }
    }
}
