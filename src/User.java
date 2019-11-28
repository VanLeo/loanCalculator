import java.util.*;

public class User {

    public static void main(String[] args) {
        //Initiate scanner instance
        Scanner scanner = new Scanner(System.in);
        //First greeting
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Do you want to make a loan? (Y / N)");
        String answer = scanner.nextLine();
        answer = answer.trim().toUpperCase();
        System.out.println("Welcome " + name + " What is your age?");
        int age = scanner.nextInt();

      if (answer.equals("Y")||answer.equals("YES")){
            LoanCalculator loanCalculator = new LoanCalculator();

                loanCalculator.calculator(name, age);

        }else {
            System.exit(1);
        }
    }
}
