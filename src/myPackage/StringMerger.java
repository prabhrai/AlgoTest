package myPackage;

public class StringMerger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(mergeStrings("abcqwerqwe","xyzvb"));
	}
	
	
	
	public static String mergeStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int length_a = a.length();
        int length_b = b.length();
        int length_max;
        if(length_a > length_b){
            length_max = length_a;
        }
        else{
            length_max = length_b;
        }
        
        for(int i = 0 ; i < length_max ; i++){
            if(i < length_a){
                sb.append(a.charAt(i));
            }
              if(i < length_b){
                 sb.append(b.charAt(i));

            }

            
        }
		return sb.toString();


        
    }

}
