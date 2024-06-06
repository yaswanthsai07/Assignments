package com.ey.day6q3;

class AccountChecker {
    private BankAccount[] accounts;

    public AccountChecker(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public boolean isValidAccount(int accno) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccno() == accno) {
                return true;
            }
        }
        throw new AccountNotFoundException("Account with account number " + accno + " not found");
    }

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        try {
            accounts[0] = new BankAccount(123456, "John Doe", "Savings", 1500);
            accounts[1] = new BankAccount(789012, "Jane Smith", "Current", 6000);
            accounts[2] = new BankAccount(345678, "Alice Johnson", "Savings", 3000);
            accounts[3] = new BankAccount(901234, "Bob Williams", "Current", 4000);
            accounts[4] = new BankAccount(567890, "Mary Brown", "Savings", 2000);
            
            AccountChecker accountChecker = new AccountChecker(accounts);
            
            // Test isValidAccount method
            int accnoToCheck = 789012;
            System.out.println("Is account " + accnoToCheck + " valid? " + accountChecker.isValidAccount(accnoToCheck));

            // Test with an invalid account number
            accnoToCheck = 999999;
            System.out.println("Is account " + accnoToCheck + " valid? " + accountChecker.isValidAccount(accnoToCheck));
        } catch (AccountNotFoundException e) {
        	System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}