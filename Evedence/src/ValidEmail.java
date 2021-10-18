
import java.util.Scanner;


public class ValidEmail {
    public static final String emailRegEx = "^[a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-zA-Z]{2,5}$";

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
        String checkEmail = sc.nextLine();
        
        if(isValid(checkEmail)){
            System.out.println("valid email");
        }
        else System.out.println("invalid email");

        
        
    }
    
    private static boolean isValid(String email){
        if(email.matches(emailRegEx)){
            return true;
        }
        return false;
    }
}
