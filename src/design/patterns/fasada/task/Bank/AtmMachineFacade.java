package design.patterns.fasada.task.Bank;

public class AtmMachineFacade {
    private AtmMachine atmMachine;
    private BankSystem bankSystem;

    public AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    public void withdrawMoney() {
        atmMachine.enterPin();
        if (bankSystem.validatePin(atmMachine.pin) && bankSystem.validateTransaction()) {
            atmMachine.withdrawCash();
        }
    }
}
