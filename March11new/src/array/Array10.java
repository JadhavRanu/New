package array;

import java.util.Arrays;

public class Array10 {
public static void main(String[] args) {
	int p;

	int arr[]= {12,34,67,89,50,37};
   

          for(int i=arr.length-1;i>=0;i--) {
        	  Arrays.sort(arr);
        	  System.out.print(arr[i]+" ");
        	  
          }
          System.out.println();
          System.out.println("*****************");
          for(int j=0;j<arr.length;j++) {
        	  Arrays.sort(arr);
        	  System.out.print(arr[j]+" ");  
          }
}}
