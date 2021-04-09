package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        /* Test dla kalkulatora **/

        Calculator firstCalculator = new Calculator(23, 21);

        if (firstCalculator.substractAFromB() == 2) {
            System.out.println("Substraction was success");
        } else {
            System.out.println("Error when substracting");
        }
        if (firstCalculator.addAtoB() == 44) {
            System.out.println("Addition was success");
        } else {
            System.out.println("Error when adding");
        }
    }

}
