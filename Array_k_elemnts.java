package github_pratice;

import java.util.Arrays;

public class Array_k_elemnts {


	public static void reverseElements(int[] arr,int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
	public static void main(String[] args) {

		
		int[] arr = {1,2,3,4,5};
		int k = 3;
		int n = arr.length;

		reverseElements(arr, 0, n-1);                        // reverse the array 
		System.out.println(Arrays.toString(arr));
		
		reverseElements(arr, 0, k-1);                          // initial half gets reversed to main array
		System.out.println(Arrays.toString(arr));
		
		reverseElements(arr, k, n-1);                        // another half gets reversed to main array
		System.out.println(Arrays.toString(arr));

		System.out.println("changes done here on may 19");
	}
}
