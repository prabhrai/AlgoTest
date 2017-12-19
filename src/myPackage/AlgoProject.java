package myPackage;
import java.util.*;
import java.io.*;


public class AlgoProject {

	
	public static void main(String[] args){
		
		
		System.out.println("Hello");
		
		System.out.println( " A "  + 1056 % 108);

		
//		Map<String, Integer> myMap = new HashMap<String, Integer>();
//		HashMap map2 = (HashMap)myMap;
//		map2.put(3, "foo");
		
		Hashtable ht = new Hashtable();
		ht.put(1, 12);
		
		
		HashMap map = new HashMap();
		map.put(1, 12);
		map.put(1, 13);
		map.put(1, 14);
		map.put(1, 15);
		map.put(1, 16);
		map.put(1, 17);
		map.put(1, 82);

		System.out.println(map.get(1));
		
		
		
//		int[] myArr = new int[5];
		int[] myArr = {1 , 6, 32, 7 ,1 ,5, 7, 98, 6,4, 3,44, 5,36, 4,563 ,546 ,5436 ,43,5,654,3, 2 , 3, 5 , 4 ,12 ,4 } ;

		displayArray(myArr);
		
//		bubbleSort(myArr);
//		
//		displayArray(myArr);

//		selectionSort(myArr);
//		
//		displayArray(myArr);
//		
		insertionSort(myArr);
		
		displayArray(myArr);
		
	}
	
	
	public static void insertionSort(int[] arr){
		System.out.println( " insertionSort " );

		for(int i = 0 ; i < arr.length ; i++){
			int j = i;
			int insert = arr[i];
			
			
			while(j > 0 && arr[j-1] > insert) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = insert;

		}
			
	}
	
	
	
	public static void selectionSort(int[] arr){
		System.out.println( " selectionSort " );

		for (int i = 0 ; i < arr.length ; i++){
			int min = i;
			
			for ( int j = i ; j < arr.length ; j++) {
				if(arr[min] > arr[j] ){
					min = j ;
				}
			}
			
			swap(arr,i,min);
//			int temp = arr[i] ;
//			arr[i] = arr[min];
//			arr[min] = temp;
		}
			
	}
		
	public static void bubbleSort(int[] arr){
		System.out.println( " bubbleSort " );

		for (int i = arr.length - 1  ; i > 1 ; i--)
		{
			for (int j = 0 ; j < i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
					swap (arr, j , j+1 );
				}
			}
		}
			
	}
	
	
	public static void swap (int[]arr, int x,int y){
		int temp = arr[x] ;
		arr[x] = arr[y];
		arr[y] =  temp;
				
	}
	
	public static void displayArray(int[] arr){
		for (int i = 0 ; i < arr.length ; i++){
			System.out.println(i + " - " + arr[i]);
		}
	}
	
	
	public static void mergeSort(int[] arr){
		
		
		
	}
		
}






