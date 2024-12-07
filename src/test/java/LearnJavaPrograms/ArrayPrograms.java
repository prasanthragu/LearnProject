package LearnJavaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//*******************Array Min Max Value Find****************************************		
//		//int arr[] = {3,2,1,56,1000,167};
//		//int arr[] = {1,345,234,21,56789};
//		int arr[] = {56789};
//		int length=arr.length;
//		int min=arr[0],max=arr[0];
//		for (int i=1;i<length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//			if(arr[i]>max) {
//				max= arr[i];
//			}
//		}
//		System.out.println("Max value in array: "+max);
//		System.out.println("Min value in array: "+min);
//************************************************************************************
		
//****************************Reverse Array*********************************************
		
//		int[] arr= {1,2,3,4,5,6,7};
//		//int[] arr= {7};
//		int len=arr.length;
//		for(int i=0;i<len/2;i++) {
//			int temp = arr[i];
//			arr[i]=arr[len-1-i];
//			arr[len-1-i]=temp;
//		}
//		System.out.println("Reversed array:");
//		for(int ele:arr){
//			System.out.print(ele+" ");
//		}
		
//*****************************************************************************************
		
//***********************************cyclically rotate an array by one**********************
		
//		int arr[]= {1,2,3,4,5};
//		int rotateCount=5;
//		int len=arr.length;
//		
//		
//		for(int i=0;i<rotateCount;i++) {
//			int lastElementValue = arr[len-1];
//			for(int j=len-1;j>0;j--) {
//				arr[j]=arr[j-1];
//			}
//			arr[0]=lastElementValue;
//			for(int ele:arr) {
//				System.out.print(ele+ " ");
//			}
//			System.out.println();
//			
//		}
//		
//		for(int ele:arr) {
//			System.out.print(ele+ " ");
//		}

		
//************************************Sort an Array ********************************************
		
		
//		int arr[]= {1, 2, 2, 1, 3, 5, 4};
//		int len=arr.length;
//		int temp=0;
//		for(int i=0;i<len;i++) {
//			for(int j=i+1;j<len;j++)
//			 if(arr[i]<arr[j]) {
//				 temp = arr[j];
//				 arr[j]=arr[i];
//				 arr[i]=temp;
//				
//			}
//		}
//		
//		for(int ele:arr) {
//			System.out.print(ele+ " ");
//		}


//******************************** Array Duplicates*************************************************
		
//		int n;
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the array length:");
//		n=in.nextInt();
//		int arr[] = new int[n];
//		List<Integer> repeatedValue = new ArrayList<Integer>();
//		for(int i=0;i<n;i++) {
//			System.out.println("Enter the value for index "+i+ ":");
//			arr[i]=in.nextInt();
//			
//		}
//		
//		for(int i=0;i<n;i++) {
//			int count =0;
//			for(int j=i;j<n;j++) {
//				
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			if(count>1) {
//				if(!repeatedValue.contains(arr[i]))
//				repeatedValue.add(arr[i]);
//			}
//			
//		}
//		if(repeatedValue.size()==0) {
//			System.out.println("-1");
//		}
//		else {
//			for(int ele:repeatedValue) {
//				System.out.println(ele);
//			}
//		}
		

		
		


	}


}
