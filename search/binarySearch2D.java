package search;

import java.util.Scanner;

public class binarySearch2D {
    public static void main(String[] args) {
        int rows, cols, key;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows:- ");
        rows=sc.nextInt();
        System.out.println("Enter the umber of columns:- ");
        cols=sc.nextInt();
        int [][] arr=new int[rows][cols];

        System.out.println("Enter the elements:- ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the element you want to search:- ");
        key=sc.nextInt();

        binarySearch2D(arr, key);
    }

    static void binarySearch2D(int[][] arr, int key){
        int rows=0;
        int cols=arr.length-1;

        while (rows<arr.length && cols>=0){
            if (arr[rows][cols] == key){
                System.out.println("Element found at ("+rows+", "+cols+") ");
                return;
            }
            if (arr[rows][cols] > key){
                cols--;
            }
            else{
                rows++;
            }
        }

        System.out.println("Element not found.");
    }
}
