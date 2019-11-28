import java.util.*;

public class LoanCalculator {

    double risk;

    void calculator(String name, int age)
    {
        if(age <= 25){
            risk = (Math.random()*((10-8)+1))+8;
        }
        else if (age <= 60 && age > 25){
            risk =  (Math.random()*((11-50)+1))+50;
        }
        else if (age > 60){
            risk =  90;
        }
        System.out.println(risk);
    }

    public static void main(String[] args){
    }
}
