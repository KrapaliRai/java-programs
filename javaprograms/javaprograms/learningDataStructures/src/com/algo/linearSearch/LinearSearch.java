package com.algo.linearSearch;

import java.util.Arrays;

public class LinearSearch {

    public static int search(int arr[],int key){
        int n = arr.length;
        for(int i=0; i < n; i++){
          if(arr[i]== key){
              return i;
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,3,2,2,45,56,6,44,66,5,78,786,78,7,867,9};
        int x = 1;

        int result = search(arr,x);
        if(result == -1){
            System.out.println("Element is not present in array");

        }
        else{
            System.out.println("Element is present at index " + result);
        }

    }



}
