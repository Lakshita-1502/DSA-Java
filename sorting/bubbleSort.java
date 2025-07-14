package sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main (String[] args){
        int size;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:- ");
        size=sc.nextInt();

        System.out.println("Enter the elements:- ");

        int[] arr=new int[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted Array:- ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
