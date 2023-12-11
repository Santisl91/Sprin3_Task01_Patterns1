package N1_Ex01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Undo undo = Undo.getInstance();

        int option;

        do {
            System.out.println("------ OPTIONS MENU ------ " +
                    "\nChoose one option: "
                    + "\n1. Add new order."
                    + "\n2. Delete order."
                    + "\n3. List last orders"
                    + "\n0. Exit. ");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    int newOrder;
                    System.out.println("Enter order number.");
                    newOrder = entrada.nextInt();
                    undo.addOrder(newOrder);
                    break;
                case 2:
                    int deleteNumber;
                    System.out.println("Enter order number.");
                    deleteNumber = entrada.nextInt();
                    undo.deleteOrder(deleteNumber);
                    break;
                case 3:
                    System.out.println(undo.getlistOrders());
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (option != 0);
    }
}
