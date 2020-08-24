 public class alternateAndMergeString { 
  
    // Function for alternatively merging two strings 
    public static String altmerge(String s1, String s2) 
    {
        // To store the final string 
        StringBuilder result = new StringBuilder(); 
     
        int k=s1.length()+s2.length();
    	if(s1.length()>s2.length()) {
    		for (int i = 0; i <s1.length(); i++) { 
  
            // First choose the ith character of the 
            // first string if it exists 
        
            if (i < s1.length()) 
                result.append(s1.charAt(i)); 
  
            // Then choose the ith character of the 
            // second string if it exists 
           if (i < s2.length()) 
              result.append(s2.charAt(i)); 
    		}
    	}
    	else if(s2.length()>s1.length())
        	for (int i = 0; i <s2.length(); i++) { 
        		 if (i < s2.length()) 
        			 result.append(s2.charAt(i)); 
       
                 // Then choose the ith character of the 
                 // second string if it exists 
                 if (i < s1.length()) 
                	 result.append(s1.charAt(i)); 
        }
        
       else{
        	for (int i = 0; i <k; i++) { 
       		 if (i < s1.length()) 
       			 result.append(s1.charAt(i)); 
      
                // Then choose the ith character of the 
                // second string if it exists 
                if (i < s2.length()) 
               	 result.append(s2.charAt(i)); 
           } 
       }
    	return result.toString(); 
    }
  
     public static void main(String[] args) 
    { 
        String s1 = "gourmet"; 
        String s2 = "lobster"; 
        System.out.println(altmerge(s1, s2)); 
    } 
}