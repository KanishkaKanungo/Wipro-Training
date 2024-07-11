import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Acounting {
    public static void main(String[] args) {
        template();

    }
    public static void template(){
        System.out.println("--------------WELCOME TO BANK MANAGEMENT SYSTEM-----------------------------");
        System.out.println(""" 
                Enter: 
                  1 -> Register
                  2 -> LogIn
                  3 -> Credit
                  4 -> Debit
                  5 -> Check Balance
                  6 -> Quit
                """);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No:");
        int a = scan.nextInt();
        Main main = new Main();
        switch (a){
            case 1:
                main.register();
                template();
                break;
            case 2:
                main.login();
                template();
                break;
            case 3:
                main.credit();
                template();
                break;
            case 4:
                main.debit();
                template();
                break;
            case 5:
                main.checkBalance();
                template();
                break;
            case 6:
                break;
            default:
                System.out.println("Invalid Number Entered!! Try Again");
                template();
        }
    }
}