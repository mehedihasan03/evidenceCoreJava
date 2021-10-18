import java.util.Scanner;
import java.util.regex.Pattern;


public class EmailValidation {
    public static final String validMail = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    
    public static void main(String[] args) {
        
        EmailValidation mailCheck = new EmailValidation();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Email");
        String email = sc.nextLine();
        
        boolean isValid = mailCheck.mailValid(email);
        if(isValid){
            System.out.println("Email is valid");
        } else{
            System.out.println("Email is invalid");
        }
    }
    
    
    private boolean mailValid(String email){
        if(email.toUpperCase().matches(validMail)){
        return true;
        }
        
        return false;
    }
}
