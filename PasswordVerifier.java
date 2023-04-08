public class PasswordVerifier {
    public static boolean isValid(String pw) {  // Created the method isValid to set the qualifications for the password
    	
    	boolean UpperCase = false;
        boolean Lowercase = false;
        boolean Digit = false;
        boolean Symbol = false;  // Set my booleans so that I can verify each respective quality of the password
    	
        if (pw.length() < 16 || pw.length() > 20) {
            return false;  // Makes it so that the password has a minimum of 16 characters and a maximum of 20 characters for the password. Any more and it is false
        }
             
        for (int c = 0; c < pw.length(); c++) {  // For loop to check each parameter of a password
        	
            char letter = pw.charAt(c);  // The characters in the password
            
            if (Character.isUpperCase(letter)) {
            	UpperCase = true;  // Checks to see if the password character has an uppercase
            } 
            
            else if (Character.isLowerCase(letter)) {
            	Lowercase = true;  // Checks to see if the password character has an lowercase
            } 
            
            else if (Character.isDigit(letter)) {
            	Digit = true;  // Checks to see if the password character has an digit
            } 
            
            else {
            	Symbol = true; // If there are no if statements that run, it returns that the password has a symbol
            }
        }
        
        return UpperCase && Lowercase && Digit && Symbol;  
    }
}
