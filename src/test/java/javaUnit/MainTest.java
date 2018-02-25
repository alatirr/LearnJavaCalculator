package javaUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTest {
    public static void main(String[] args){
        System.out.println("start MainTest class");
        Result results = JUnitCore.runClasses(CalculatorTest.class);
        for (Failure failure : results.getFailures()) {
            System.out.println("Тест не пройден: " + failure);
        }
    }
}
