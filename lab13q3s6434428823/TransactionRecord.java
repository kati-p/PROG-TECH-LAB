/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class TransactionRecord {

    private int accountNumber;
    private double amountOfTransaction;

    public TransactionRecord(int accountNumber, double amountOfTransaction) {
        this.accountNumber = accountNumber;
        this.amountOfTransaction = amountOfTransaction;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmountOfTransaction(double amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmountOfTransaction() {
        return amountOfTransaction;
    }
}
