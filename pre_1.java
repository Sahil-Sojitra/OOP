import java.util.Scanner;

public class pre_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your 1st num :");
        int num1 = in.nextInt();

        System.out.println("Enter your 2nd num :");
        int num2 = in.nextInt();


        System.out.println("Enter Your choice for perform the operation \n 1 -> Addditon \n 2 -> Subtraction \n 3 -> Multiplication \n 4 -> Division ");
        int choice = in.nextInt();

        switch(choice){
            case 1:
            {
                int num3 = num1+num2;
                System.out.println("The sum of "+num1+" and "+num2+" = "+num3);
                break;
            }
            case 2:
            {
                int num3 = num1-num2;
                System.out.println("The sub of " + num1 + " and " + num2 + " =" + num3);
                break;
            }
            case 3:
            {
                int num3 = num1*num2;
                System.out.println("The mul of " + num1 + " and " + num2 + " = " + num3);
                break;
            }
            case 4:
            {
                int num3 = num1/num2;
                System.out.println("The div of " + num1 + " and " + num2 + " = " + num3);
                break;
            }
        }
    }
}
