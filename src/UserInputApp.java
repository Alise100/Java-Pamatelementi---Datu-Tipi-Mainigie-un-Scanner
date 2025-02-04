import java.util.Scanner;

public class UserInputApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String vārds;
        int vecums;
        double augums;
        boolean patīkProgrammēt;

        System.out.print("Lūdzu, ievadiet savu vārdu: ");
        vārds = scanner.nextLine();

        System.out.print("Lūdzu, ievadiet savu vecumu: ");
        vecums = scanner.nextInt();

        System.out.print("Lūdzu, ievadiet savu augumu metros: ");
        augums = scanner.nextDouble();

        System.out.print("Vai jums patīk programmēt? (true/false): ");
        patīkProgrammēt = scanner.nextBoolean();

        System.out.println("\nJūsu ievadīta informācija:");
        System.out.println("Vārds: " + vārds);
        System.out.println("Vecums: " + vecums + " gadi");
        System.out.println("Augums: " + augums + " metri");
        System.out.println("Patīk programmēt: " + (patīkProgrammēt ? "Jā" : "Nē"));

        int vecumsDienās = vecums * 365;
        double augumsCentimetros = augums * 100;

        System.out.println("\nAprekini:");
        System.out.println("Vecums dienās: " + vecumsDienās);
        System.out.println("Augums centimetros: " + augumsCentimetros + " cm");

        scanner.close();
    }
}