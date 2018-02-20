package myPackage;

import java.util.HashMap;
import java.util.Map;

public class GC_Test {

	public static void main(String[] args) {
		int s = 301;
		
		
		 int cost = 0;
		 
	        if(s < 300){
	            cost = s * 3 ;
	        }
	        else if(s >= 300){
	            int minutes = 0;
	            
	            if(s % 60 == 0) {
	            minutes = s / 60;
	            }
	            else {
		            minutes = s / 60 + 1;
	            }
	            
		        System.out.println(minutes);

	            cost = minutes * 150;
	        }
	        else {
	            cost = 0;
	        }
	        
	        System.out.println(s);
	        System.out.println(cost);
	}
}
