package search;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchSortedMatrix {
    public static void main(String[] args){
        int rows, cols, key;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of rows:- ");
        rows=sc.nextInt();
        System.out.println("Enter the no. of columns:- ");
        cols=sc.nextInt();

        int [][] arr=new int[rows][cols];

        System.out.println("Enter elements:- ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the no. you want to search:- ");
        key=sc.nextInt();

        String index= Arrays.toString(search(arr, key));
        if (index.equals("[-1, -1]")){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+index+" position");
        }
    }

    static int[] binarySearch(int [][]arr, int row, int cStart, int cEnd, int key){
        while (cStart <= cEnd){
            int mid=cStart + (cEnd-cStart)/2;
            if (arr[row][mid]==key){
                return new int[]{row, mid};
            }
            if (arr[row][mid] < key){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][]arr, int key){
        int rows=arr.length;
        int cols=arr[0].length;

        if (rows==1){
            return binarySearch(arr,0, 0, cols-1, key);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        while (rStart<=(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if (arr[mid][cMid]==key){
                return new int[] {rStart, cMid};
            }
            if (arr[mid][cMid]<key){
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }

        if (arr[rStart][cMid]==key){
            return new int[]{rStart, cMid};
        }
        if (arr[rStart+1][cMid]==key){
            return new int[]{rStart+1, cMid};
        }

        if (key<=arr[rStart][cMid-1]){
            return binarySearch(arr, rStart, 0, cMid-1, key);
        }
        if (key >= arr[rStart][cMid+1]){
            return binarySearch(arr, rStart, cMid+1, cols-1, key);
        }
        if (key <= arr[rStart+1][cMid-1]){
            return binarySearch(arr, rStart+1, 0, cMid-1, key);
        }
        else{
            return binarySearch(arr, rStart+1, cMid+1, cols-1, key);
        }
    }

}
