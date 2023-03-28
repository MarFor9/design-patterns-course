package design.patterns.fasada.task.Bank;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
    }
}
