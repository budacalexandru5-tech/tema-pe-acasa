import java.util.Scanner;

public class ATM {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String valuta = "";
        int optiune;
        double[] valute = new double[3]; // 0 - mdl, 1 - eur, 2 - usd
        valute[0] = 0.0;
        do{
            menu();
            optiune = input.nextInt();
            switch (optiune){
                case 1:
                    sold(valute);

                    break;
                case 2:
                    valute[0] = depunere(valute[0]);
                    break;
                case 3:
                    valute[0] = extragere(valute[0]);
                    break;
                case 4:

                    valute = exchange(valute, valuta);

                    break;
                case 5: for(int i = 0; i < 3; i++) System.out.print(valute[i] + " ");
                break;
                case 6: break;
                default:
                    System.out.println("Introdu o optiune valida! (1 - 4)");
            }
        }while(optiune!=6);

    }
    public static void menu(){
        System.out.println("---------ATM--------");
        System.out.println("|     Opțiuni:     |");
        System.out.println("|    1.Sold(1)     |");
        System.out.println("|    2.Depunere(2) |");
        System.out.println("|    3.Extragere(3)|");
        System.out.println("|    4.Schimb(4)   |");
        System.out.println("|5.AfisareValute(5)|");
        System.out.println("|    6.Iesire(6)   |");
        System.out.println("--------------------");
    }
    public static void sold(double [] balance){
        System.out.println("Soldul dvs este: " + balance[0] + "MDL, " + balance[1] + " EUR, " + balance[2] + " USD.");
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

    public static double [] exchange(double []valute, String valuta){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti valuta in care vreti sa schimbati: ");
        valuta = input.next();
        double suma;
        switch (valuta){
            case "EUR" :
                System.out.println("Introduceti suma de MDL pentru a schimba in EUR: ");
                suma = input.nextDouble();
                valute[1] = suma / 20;
                valute[0] = valute[0] - suma;
                break;
            case "USD" :
                System.out.println("Introduceti suma de MDL pentru a schimba in USD: ");
                suma = input.nextDouble();
                valute[2] = suma / 18;
                valute[0] = valute[0] - suma;
                break;
            default:
                System.out.println("Introduceti doar USD sau EUR!");
        }
        return valute;
    }


}
