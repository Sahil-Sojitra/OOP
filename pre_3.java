import java.util.Scanner;

public class pre_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = in.next();

        if(ValidPassword(password)){
            System.out.println("The given Password is Valid");
        }
        else{
            System.out.println("The given Password is Invalid");
        }
    }

    public static boolean ValidPassword(String password){
        if(password.length() >8 ){
            return true;
        }

        if(password.matches(".*[A-Z].*")){
            return true;
        }

        if (password.matches(".*[0-9].*")) {
            return true;
        }
        if(password.matches("*.[$#%].*")){
            return true;
        }
        return false;
    }
}