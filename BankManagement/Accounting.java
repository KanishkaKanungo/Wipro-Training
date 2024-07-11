import java.util.Scanner;

public class  Acounting implements Management{
    Scanner scan  = new Scanner(System.in);
    private int netBalance = 0;
    @Override
    public void credit() {
        System.out.print("Enter the amount to be credited: ");
        int amount = scan.nextInt();
        System.out.println("Credit Successful!!");
    }

    @Override
    public void debit() {
        System.out.print("Enter the amount to be debited: ");
        int amount = scan.nextInt();
        System.out.println("Debit Successful!!");
    }

    @Override
    public void login() {
        System.out.print("Enter UserName: ");
        String username = scan.next();
        System.out.println("Enter Password:");
        String password = scan.next();
        System.out.println("Login Successful!!");
    }

    @Override
    public void checkBalance() {
        System.out.println("Net Balance: " + netBalance);

    }

    @Override
    public void register() {
        System.out.print("Enter your EMail-ID: ");
        String email = scan.next();
        System.out.print("Create Password: ");
        String newPassword = scan.next();
        System.out.println("Enter Account Number: ");
        String accountNumber = scan.next();
        System.out.println("Account Created Successfully!!");
    }
}
