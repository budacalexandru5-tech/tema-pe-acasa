import java.util.Scanner;

public class Tema9Noiembrie {

    public static void main() {
        taskMenu();
    }
    public static void taskMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu un nr de la 1-5: ");
        int tasknr = input.nextInt();
        if(tasknr == 1){
            task1();
        }else if(tasknr == 2){
            task2();
        }else if(tasknr == 3){
            task3();
        }else if(tasknr == 4){
            task4();
        }else if(tasknr == 5){
            task5();
        }else {
            System.out.println("Introdu un nr de la 1-5!");
        }
    }

    public static void task1(){
        for(int i = 10; i <= 20; i++){
            System.out.println(i);
            if(i == 15) break;
        }
    }
    public static void task2(){
        for(int i = 10; i <= 30; i++){
            if(i == 16) continue;
            if(i % 2 == 0) System.out.println(i);
            if(i == 20) break;
        }
    }
    public static void task3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introdu un nr ");
        int nr = input.nextInt();

        if(nr > 0) {
            System.out.println("Pozitiv");
        }else System.out.println("Negativ");
    }
    public static void task4(){
        Scanner input = new Scanner(System.in);
        int nr1 = input.nextInt();
        int nr2 = input.nextInt();
        if(nr1 == nr2){
            System.out.println("Corespund");
        }else System.out.println("Nu corespund");
    }
    public static void task5(){
        Scanner input = new Scanner(System.in);
        int c;

        do {
            System.out.println("Introduceti 2 numere: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + b);
            System.out.println("Doriti sa efectuati din nou operatia? (1 (DA) / 0(NU))");
            c = input.nextInt();

        } while (c == 1);

    }
}
