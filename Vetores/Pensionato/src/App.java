import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            
            Rent rent = new Rent(name, email);

            vect[roomNumber] = rent;

        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.print(i + ":" + vect[i]);
            }
        }

        sc.close();
    }
}