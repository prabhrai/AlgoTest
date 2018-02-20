package myPackage;
import java.util.*;
import java.io.*;


public class AlgoProject {

	
	public static void main(String[] args){
		/*
		
		System.out.println("Hello");
		
		System.out.println( " A "  + 1056 % 108);

		
		String tString = "xasdfasdfsdfsdBCS";
		char[] ch = tString.toCharArray();
		
		System.out.println(ch[0]);
		
		System.out.println(tString.length());
		System.out.println(tString.charAt(16));

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
		int[] myArr = {1 , 6, 32, 7 ,1 ,3, 2 , 3, 5 , 4 ,12 ,4 } ;

//		displayArray(myArr);
		
//		bubbleSort(myArr);
//		
//		displayArray(myArr);

//		selectionSort(myArr);
//		
//		displayArray(myArr);
//		
//		insertionSort(myArr);
		
		displayArray(myArr);
		
		mergeSort(myArr , 0 ,myArr.length -1  );
		
		displayArray(myArr);

		*/
		 char[] c={'a',' ','c',' ','e',' ','g',' ','i',' ','k'};
//         char[] cn = replaceSpace(c);
         char[] cn1 = replaceSpace2(c);

         
         
//         for(int i=0;i<cn.length;i++)
//   		  System.out.print(cn[i] + "-");
         
	}
	
	
	public static char[] replaceSpace(char[] given) {
	    int num = given.length ;
		  System.out.println("--replaceSpace--");

 		  System.out.println(num);

	      for( int i = 0 ; i < num ; i++ ) {
	   		  System.out.println("in for" + i);

	        if( given[i] == ' ' ) {
	   		  System.out.println("xx");
	   		  System.out.println("in if" + i);

	            int counter  ;
//	  	   		  System.out.println("given[counter + 1 ]" + given[counter + 1 ]);

	  	   		  for(counter = i ; counter < num ; counter++) {
	  	   			  if(given[counter] != ' ') {
	  	   				  break;
	  	   			  }  
	  	   		  }
	  	   		  
		  	   	System.out.println("after");
	  	   		System.out.println("counterx" + counter);
	  	   		  
	  	   		
//	  	   		given[i] = 'w';
	  	   		if( counter < num ) {
	  	   		char temp = given[i];
	  	   		System.out.println(temp+"temp");
	   		  	given[i] = given[counter];
	   		  	given[counter] = temp;
	  	   		}
	  	   		
	    
	    } // for 
	      
	      for(int j =0;j <given.length;j++)
	   		  System.out.print(given[j] );
   		  	  System.out.println();
	      }// for
	     
	   return given;

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
		System.out.println( " displayArray " );

		for (int i = 0 ; i < arr.length ; i++){
			System.out.println(i + " - " + arr[i]);
		}
	}
	
	
	public static void mergeSort(int[] arr , int low , int high){
//		System.out.println( "  " );

//		int low = 0;
//		int high = arr.length - 1 ;
		
		if(low < high ) {
			
		int mid = (int) Math.floor((low+high)/2);

//		int mid = low + ( high - low) / 2 ;
		
		mergeSort(arr, low , mid);
		mergeSort(arr, mid + 1 , high);
		merge(arr,low,mid,high);
		
		}
//		System.out.println(low);
//		System.out.println(high);
//		System.out.println(mid);
//		
//		System.out.println(arr[low]);
//		System.out.println(arr[mid]);
//		System.out.println(arr[high]);

	}
	
	public static void merge(int[] arr, int low , int mid , int high){

		int left = mid - low + 1;
		int right = high - mid;
		int[] leftArr = new int[left];
		int[] rightArr = new int[right];

		for(int i = 0 ; i < left ; i++ ) {
			leftArr[i] = arr[low + i];
		}
		for(int j = 0 ; j < right ; j++ ) {
			rightArr[j] = arr[mid + 1 + j];
		}
		
		
		int i = 0;
		int j = 0;
		for (int k = low ; k <= high ; k++) {
//			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {

			if( ( j >= right ) || (  i < left && leftArr[i] <= rightArr[j] )  ) {
				arr[k] = leftArr[i] ;
				i = i + 1;
			}
			else {
				arr[k] = rightArr[j] ;
				j = j + 1;
			}
			
		}
		

		System.out.println("--merge--");

		System.out.println(low);
		System.out.println(mid);
		System.out.println(high);
		
		System.out.println("--merge--");


	}
	
	
	public static char[] replaceSpace2(char[] given) {
		int num = given.length;
		System.out.println("--replaceSpace2--");
		System.out.println(num);

		for (int i = 0; i < num; i++) {
//			System.out.println("in for" + i);
			if (given[i] == ' ') {
//				System.out.println("xx");
//				System.out.println("in if" + i);
				int counter = i + 1;
				// System.out.println("given[counter + 1 ]" + given[counter + 1 ]);
				while (counter < num && given[counter ] == ' ') {
//					System.out.println("Im in while loop");
					counter = counter + 1;
				} // while , check + 1

				if (counter < num) {
//					System.out.println("inner");
					System.out.println(given[counter]);
//					System.out.println("given[counter]");
//					System.out.println(given[i]  + "given[i]");
					char temp = given[i];
//					System.out.println(temp + "temp");
					given[i] = given[counter];
					given[counter] = temp;
				} else {
					i = num;
				}
			} // if
			
//				System.out.println();
			} // for
			System.out.println();
			for (int j = 0; j < given.length; j++) {
				System.out.print(given[j]);
		} // outer for loop

		return given;

	} // replace string 2
}
