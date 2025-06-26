package search;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:- ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements in sorted manner:- ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be searched:- ");
        int search=sc.nextInt();

        int ans=binarySearch(arr,search);
        if (ans!=-1){
            System.out.println("Element found at index "+ans);
        }
        else{
            System.out.println("Element not found");
        }
    }

    static int binarySearch(int[] arr, int key){
        int start=0, end=arr.length-1, mid;
        while (start <= end) {
            mid=start+(end-start)/2;
            if (arr[mid]==key) {
                return mid;
            }
            else if (arr[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
