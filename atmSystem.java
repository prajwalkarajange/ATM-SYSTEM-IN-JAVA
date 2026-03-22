import java.util.*;

public class atmSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        float balance = 0f;

        
        System.out.println("Enter PIN: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid PIN format!");
            return;
        }

        int id = sc.nextInt();

        if (id != 1234) {
            System.out.println("Incorrect PIN. Exiting...");
            return;
        }

        while (flag) {
            System.out.println("\n*************************************************");
            System.out.println("Enter choice:");
            System.out.println("1: Check Balance\n2: Deposit\n3: Withdraw\n4: Exit");

            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Enter number only.");
                sc.nextLine(); 
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter amount to Deposit:");

                    if (!sc.hasNextFloat()) {
                        System.out.println("Invalid amount!");
                        sc.nextLine(); 
                        break;
                    }

                    float amount = sc.nextFloat();

                    if (amount <= 0) {
                        System.out.println("Enter valid positive amount!");
                        break;
                    }

                    balance += amount;
                    System.out.println("Amount Deposited Successfully!");
                    break;

                case 3:
                    System.out.println("Enter amount to Withdraw:");

                    if (!sc.hasNextFloat()) {
                        System.out.println("Invalid amount!");
                        sc.nextLine(); 
                        break;
                    }

                    float withdraw = sc.nextFloat();

                    if (withdraw <= 0) {
                        System.out.println("Enter valid amount!");
                    } else if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Withdrawn successfully!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank You. Visit Again!");
                    flag = false;
                    break;

                default:
                    System.out.println("Enter valid input!");
            }
        }

        sc.close();
    }
}