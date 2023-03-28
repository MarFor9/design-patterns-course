package design.patterns.fasada.task.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AtmMachine {
    String pin;

    void checkBalance() {
        System.out.println("You have money on your account");
    }

    void enterPin() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            pin = reader.readLine();
            System.out.println("Pin entered.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void withdrawCash() {
        System.out.println("Cash withdrawn successfully!");
    }
}
