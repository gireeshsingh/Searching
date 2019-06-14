import java.io.*;
import java.util.*;

public class binarySearch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int i;
		System.out.println("Enter the elements: ");
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched: ");
		int val=sc.nextInt();
		int start=0, end=n-1, mid;
		while(start<=end){
			mid=(start+end)/2;
			if(arr[mid]==val){
				System.out.println("Element found at: "+mid);
				break;
			}
			else if(val>arr[mid]){
				start=mid+1;
			}
			else if(val<arr[mid]){
				end=mid-1;
			}
			if(start>end){
				System.out.println("Element not found");
			}
		}
	}
}