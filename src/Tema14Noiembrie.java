import java.util.Scanner;

public class Tema14Noiembrie {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("A - Ex1, B - Ex2");
        String optiune = input.nextLine();
        switch (optiune){
            case "A" : Ex1(); break;
            case "B" : Ex2(); break;
            default:
                System.out.println("Introdu doar A sau B");
        }
    }
    public static void Ex1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu numarul de note: ");
        int nrNote = input.nextInt();
        double [] note = new double[nrNote];
        for(int i = 0; i < note.length; i++){
            System.out.println("Nota " + (i + 1) + ": ");
            note[i] = input.nextDouble();
        }

        double s = 0;
        for(double nota : note) s += nota;
        System.out.println("Media este " + s / nrNote);
    }

    public static void Ex2() {
        int [] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu 5 elemente: ");
        for(int i = 0; i < 5; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Tabloul pe care lai introdus : ");
        for(int nr : arr) System.out.print(nr + " ");
        System.out.println();
        System.out.println("Tabloul pe care lai introdus, inversat: ");
        for(int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
    }

}
