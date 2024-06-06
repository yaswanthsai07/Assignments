package com.ey.day6q3;

class BankAccount {
    private int accno;
    private String custname;
    private String acctype;
    private float balance;

    public BankAccount(int accno, String custname, String acctype, float balance) {
        this.accno = accno;
        this.custname = custname;
        this.acctype = acctype;
        try {
            if (balance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
            if ((acctype.equals("Savings") && balance < 1000) || (acctype.equals("Current") && balance < 5000)) {
                throw new IllegalArgumentException("Initial balance is below required minimum");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }
        this.balance = balance;
    }

    public void deposit(float amt) {
        try {
            if (amt < 0) {
                throw new IllegalArgumentException("Deposit amount cannot be negative");
            }
            balance += amt;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void withdraw(float amt) {
        try {
            if (amt < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative");
            }
            if ((acctype.equals("Savings") && balance - amt < 1000) || (acctype.equals("Current") && balance - amt < 5000)) {
                throw new IllegalArgumentException("Insufficient funds for withdrawal");
            }
            balance -= amt;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public float getBalance() {
        return balance;
    }

    

	public int getAccno() {
		// TODO Auto-generated method stub
		return accno;
	}
}
