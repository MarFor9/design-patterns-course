package design.patterns.fasada.task.Bank;

class BankSystem {
    void transferMoney() {
        System.out.println("Transferred money");
    }

    boolean validatePin(String pin) {
        if ("1234".equals(pin)) {
            System.out.println("PIN number validated.");
            return true;
        }
        return false;
    }

    boolean validateTransaction() {
        System.out.println("Transaction validated.");
        return true;
    }

    void getTransactionHistory() {
        System.out.println("History");
    }
}
