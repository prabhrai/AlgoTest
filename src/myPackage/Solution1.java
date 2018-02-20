package myPackage;

public class Solution1 {



	    public static void main (String[] args) {
	        // write your code in Java SE 8
	    	
	    	int[] A = {1,2,5,7,11,21,4,3,4,5,7,8,8};
	    	
	        int returnVal = 0;
	        int max = 0;
	         
	        for(int i = 0 ; i < A.length ; i++){
	           
	            if(A[i] > max){
	              max =  A[i];
	            }
	        }
	        
	        System.out.println(max);
	        
	        Boolean[] vals = new Boolean[max + 1];
	        
	        for(int z = 0 ; z < vals.length ; z++){
	           vals[z] = false;
	        }
	        
	        
	        for(int j = 0 ; j < A.length ; j++){
	            int temp = A[j];
	           vals[temp] = true;
	        }
	        
	        
	        for(int k = 0 ; k < vals.length ; k++){
	          if(vals[k] == false && k != 0 ){
	              returnVal = k;
	              break;
	          }
	          
	        }
	        
	      
	        System.out.println(returnVal);

	    }
	
	    
	    
	    
	    
}
