import java.util.Scanner;

public class ATM {
    public static void main() {
        Scanner input = new Scanner(System.in);
        double balance = 0.0;
        int optiune;
        do{
            menu();
            optiune = input.nextInt();
            switch (optiune){
                case 1:
                    sold(balance);
                    break;
                case 2:
                    balance = depunere(balance);
                    break;
                case 3:
                    balance = extragere(balance);
                    break;
                case 4: break;
                default:
                    System.out.println("Introdu o optiune valida! (1 - 4)");
            }
        }while(optiune!=4);

    }
    public static void menu(){
        System.out.println("---------ATM--------");
        System.out.println("|     Opțiuni:     |");
        System.out.println("|    1.Sold(1)     |");
        System.out.println("|    2.Depunere(2) |");
        System.out.println("|    3.Extragere(3)|");
        System.out.println("|    4.Iesire(4)   |");
        System.out.println("--------------------");
    }
    public static void sold(double balance){
        System.out.println("Soldul dvs: " + balance);
    }
    public static double extragere(double balance){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti suma de extargere: ");
        double sumaDeExtragere = input.nextDouble();
        if(sumaDeExtragere > balance) System.out.println("Suma de extragere e mai mare ca soldul dvs!");
        else balance -= sumaDeExtragere;
        return balance;
    }
    public static double depunere(double balance){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti suma de depunere: ");
        double sumaDeDepunere = input.nextDouble();
        balance += sumaDeDepunere;
        return balance;
    }


}
