import java.util.*;

public class LoanCalculator {

    double risk;
    String nameA;
    int ageB;
    int $loanAmount;
    int savingsAmount;
    int $monthly;

    void calculator(String name, int age, int loanAmount, int savingAmount, int monthlyPayment)
    {//Assign value to variables
        nameA = name;
        ageB = age;
        $loanAmount = loanAmount;
        savingsAmount = savingAmount;
        $monthly = monthlyPayment;
        risk();
    }
    private double risk() {
        if (ageB <= 25) {
            if (savingsAmount >= 1000) {
                risk = (Math.random() * ((10 - 8) + 1)) + 8;
                return risk;
            } else if (savingsAmount < 1000){
                System.out.println("Not eligible for loan");
                System.exit(1);
            }
        } else if (ageB <= 60 && ageB > 25) {
            if (savingsAmount >= 150000) {
                risk =  (Math.random() * ((10 - 8) + 1)) + 8;
                return risk;
            } else if (savingsAmount >= 20000) {
                risk = (Math.random() * ((11 - 50) + 1)) + 50;
                return risk;
            } else if (savingsAmount < 1000) {
              System.out.println("Not eligible for loan");
              System.exit(1);
            }
        } else {
            return risk = 90;
        }
        return risk;
    }
    public static void main(String[] args){
    }
}
