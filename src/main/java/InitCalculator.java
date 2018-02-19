import division.DivisionClass;
import multiplication.MultiClass;
import subtraction.SubClass;
import sum.SumClass;

import java.util.Scanner;

public class InitCalculator {
    public static void main(String[] args){
        boolean stop = true;
        while(stop) {
            System.out.println("Choose operation: input minus or sum or degree or multiple");
            Scanner sc = new Scanner(System.in);
            String inputOperation = sc.nextLine();
            System.out.println("Enter the first number: ");
            float num1 = sc.nextFloat();
            System.out.println("Enter the second number: ");
            float num2 = sc.nextFloat();

            System.out.println("Enter the first number: ");
            if(new String("minus").equals(inputOperation)) {
                System.out.printf("%.4f", new SubClass().Sub(num1, num2));
            }
            else if(new String("sum").equals(inputOperation)){
                System.out.printf("%.4f", new SumClass().Sum(num1, num2));
            }
            else if(new String("degree").equals(inputOperation)){
                System.out.printf("%.4f", new DivisionClass().division(num1, num2));
            }
            else if(new String("multiple").equals(inputOperation)){
                System.out.printf("%.4f", new MultiClass().multiplication(num1, num2));
            }
            System.out.println("You want exit? Press q");
            String exit = sc.nextLine();
            if(new String("q").equals(exit)){
                stop = false;
            }
        }
    }
}
