//A Java Program to illustrate Caesar Cipher Technique 
class CaesarCipher { 
    // Encrypts text using a shift od s 
    public static StringBuffer encrypt(String text, int s) { 
    
        StringBuffer result= new StringBuffer();
        // This iterates through each charecter of the input 
        for (int i=0; i<text.length(); i++) { 
        
            // If upper case, we will keep it an upper case if after the shift the number is too high, it wraps back to 65 (ASSCI number for A) 
            if (Character.isUpperCase(text.charAt(i))) { 
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65); 
                result.append(ch); 
            } 
            
            // If lower case, we will also wrap it back to a and add it to our result
            else if (Character.isLowerCase(text.charAt(i))) { 
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97); 
                result.append(ch); 
                
            } else {
            
               // If the charecter is a space, then we replace that with a zero 
               char ch = (char) (((int)text.charAt(i))); 
               if (ch==' '){
                  result.append('0');
               } else {
                   result.append(ch); 
            }    
         }  
      } 
      text = result.toString(); 
      return result;
   }

  
    // Driver code 
    public static void main(String[] args) 
    { 
        String text = "Aa , Zz"; 
        int s = 4; 
        System.out.println("Text  : " + text); 
        System.out.println("Shift : " + s); 
        System.out.println("Cipher: " + encrypt(text, s)); 
    } 
} 