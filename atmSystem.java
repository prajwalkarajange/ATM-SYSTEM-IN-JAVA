import java.util.*;
public class atmSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        float balance = 0f;
        System.out.println("Enter PIN: ");
        int id = sc.nextInt();
        if (id != 1234) {
            System.out.println("Incorrect PIN. Exiting...");
            sc.close();
            return;
        }
        while (flag) {
            System.out.println();
            System.out.println("*************************************************");
            System.out.println("Enter choice: ");
            System.out.println("What do you want to do?");
            System.out.println("1: Check Balance\n2: Deposit\n3: Withdraw\n4: Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter amount to Deposit:");
                    float amount = sc.nextFloat();
                    balance += amount;
                    System.out.println("Amount Deposited Successfully!");
                    break;

                case 3:
                    System.out.println("Enter amount to Withdraw:");
                    float withdraw = sc.nextFloat();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Withdrawn successfully!");
                    } else {
                        System.out.println("Insufficient balance! Try Again!");
                    }
                    break;

                case 4:
                    System.out.println("Thank You. Visit Again!");
                    flag = false;
                    break;

                default:
                    System.out.println("Enter valid input!");
                    break;
            }
        }
        sc.close();
    }
}