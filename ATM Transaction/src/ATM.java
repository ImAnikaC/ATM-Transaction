import java.util.Scanner;
import java.text.*;

public class ATM {
	
	//deposit method
	public static double depo(double deposit, double balance) {
		balance = deposit + balance;
		return balance;
		
	}
	
	//withdraw method
	public static double with(double withdraw, double balance) {
		balance = balance - withdraw;
		return balance;
	}

	public static void main(String[] args) {
		int user;
		double balance = 0.0;
		Scanner input = new Scanner(System.in);
		
		do {
			DecimalFormat f = new DecimalFormat("#0.00");
			System.out.println("1. View your Balance");
			System.out.println("2. Deposit Cash");
			System.out.println("3. Withdraw Cash");
			System.out.println("4. Exit");
			System.out.println();
			
			System.out.print("Enter your selection: ");
			user = input.nextInt();
			System.out.println();
			
			if (user == 1) {
				System.out.println("Your balance is " + f.format(balance));
				System.out.println();
			}
			
			else if (user == 2) {
				System.out.print("Enter the amount you want to deposit: ");
				double deposit = input.nextDouble();
				System.out.println();
				
				//validation 
				
				if (deposit<=0) {
					System.out.println("You cannot deposit this amount");
					System.out.println();
				}
				else if (deposit>0) {
					balance= depo(deposit,balance);
					System.out.println();
				}
				
			}
			
			else if (user == 3) {
				System.out.print("Enter the amount you want to withdraw: ");
				double withdraw = input.nextDouble();
				System.out.println();
				
				//validation 
				if (withdraw>balance) {
					System.out.println("Sorry you don't have enough balance!");
				}
				else if (withdraw<=balance) {
					balance = with(withdraw,balance);
					System.out.println();
				}
			}
	
			
		} while (user!=4);
		
		if (user == 4) {
			System.out.println("Goodbye");
		}
		
		input.close();
		
	}

	}
