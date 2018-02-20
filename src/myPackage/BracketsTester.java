package myPackage;

import java.util.Scanner;
import java.util.Stack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class BracketsTesteer {

	static String[] braces(String[] values) {
        String[] rValue = new String[values.length];
        
        for(int i = 0 ; i < values.length ; i++) {
        	rValue[i] = isBalanced(values[i]) ;
        }
        
		return rValue;
       
	}
   
	
	
	
	
	    static String isBalanced(String s) {
	        // Complete this function
	        Stack<Character> ss = new Stack<Character>();
	        char[] chr = s.toCharArray();
	        
	        
		        for(Character c :  chr){
		                if(c == '{' || c == '[' || c == '('){
		                    ss.push(c);
		                }
		                else if(ss.isEmpty()) {
		                	  return "NO";
		                }
		                
		                
		                else if( (c == '}'  && ss.peek() == '{')
		                      || (c == ']'  && ss.peek() == '[')
		                      || (c == ')'  && ss.peek() == '(')    ){
		                     ss.pop();
		                 }
		        }
		        

		        if( ss.isEmpty() ){
		                    return "YES";
		        }
		        else{
		            return "NO";
		        }
		         
	            
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            String s = in.next();
	            String result = isBalanced(s);
	            System.out.println(result);
	        }
	        in.close();
	    }
	    
	    
	}
