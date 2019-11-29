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
          System.out.println("What is the amount you want to loan?");
          int loanAmount = scanner.nextInt();
          System.out.println("What is the amount of savings you have in your bank account?");
          int savingAmount = scanner.nextInt();
          System.out.println("What is the amount of monthly payments that you can afford?");
          int monthlyPayment = scanner.nextInt();
            LoanCalculator loanCalculator = new LoanCalculator();

                loanCalculator.calculator(name, age);

        }else {
            System.exit(1);
        }
    }
}
