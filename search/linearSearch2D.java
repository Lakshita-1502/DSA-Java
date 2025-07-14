package search;

import java.util.Scanner;

public class linearSearch2D {
    public static void main(String[] args) {
        int rows, cols, key;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of rows:- ");
        rows=sc.nextInt();
        System.out.println("Enter the no. of columns:- ");
        cols=sc.nextInt();
        int[][] arr=new int[rows][cols];

        System.out.println("Enter the elements:- ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the number u want to search:- ");
        key=sc.nextInt();

        linearSearch2D(arr, key);

    }

    static void linearSearch2D(int[][] arr, int key){
        int flag=0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j] == key){
                    System.out.println("Element found at index ("+i+", "+j+")");
                    flag=1;
                    break;
                }
            }
        }

        if (flag==0){
            System.out.println("Element not found");
        }
    }
}
