package Question3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class Loan {
    private double amount;
	private double interest;
	private double time;
	
	public Loan(double amount, double interest, double time) {
		super();
		this.amount = amount;
		this.interest = interest;
		this.time = time;
	}
	public double getAmount() {
		return amount;
	}
	public double getInterest() {
		return interest;
	}
	public double getTime() {
		return time;
	}
	@Override
	public String toString() {
		return "Loan [amount= " + amount + ", interest= " + interest + ", time= " + time + "]";
	}
}
