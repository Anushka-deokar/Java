

import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 105, 76, 34, 4, 67, 45, 34, 45 };
        int left = 0, right = arr.length - 1;
         while(left < right )
         {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
         }

         // Find maximum element
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
       System.out.println("Maximum element in array is " + max);
    }
    }


