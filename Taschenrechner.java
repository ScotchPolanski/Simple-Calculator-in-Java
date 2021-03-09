import java.util.Scanner;
public class Taschenrechner{


    public static void main(String[] args) {



        System.out.println(" ****Taschenrechner**** \n");
        Scanner Scan = new Scanner(System.in);


        System.out.println("\n Gebe zwei Zahlen ein");
        int xe;
        int xo;
        System.out.print("\n Erste Zahl: ");
        xe = Scan.nextInt();
        System.out.print("\n Zweite Zahl: ");
        xo = Scan.nextInt();

        System.out.println("\n Wähle aus zwischen (*,/,+,-): \n");
        String Operation = Scan.next();
        String EO = "Du hast gewählt ";

                switch (Operation) {

        case "*": System.out.println(EO + "* \n Your Result: "+( xe * xo )); break;
        case "/": System.out.println(EO + "/ \n Your Result: "+ ( xe / xo )); break;
        case "+": System.out.println(EO + "+ \n Your Result: "+ ( xe + xo )); break;
        case "-": System.out.println(EO + "- \n Your Result: "+( xe - xo )); break;
        default: System.out.println("\n Please select a valid character"); }
    }
}