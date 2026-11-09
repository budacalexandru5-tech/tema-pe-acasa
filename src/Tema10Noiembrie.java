import java.util.Scanner;

public class Tema10Noiembrie {
    public static void main() {
        System.out.println("Introdu numarul de elemente: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            int element = input.nextInt();
            arr[i] = element;
        }
        int suma = 0;
        for(int element : arr){
            if(element % 2 != 0){
                suma += element;
            }
        }
        System.out.println("Suma : " + suma);

    }
}
