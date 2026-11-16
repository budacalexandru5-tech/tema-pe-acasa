public class Tema17Noiembrie {
    public static void main() {
        //cel mai mare numar din matrice
        int[] arr = {23, 6, 47, 35, 2, 14};
        System.out.println("Media numerelor tabloului este: " + media(arr));
        System.out.println("Cel mai mare numar din tablou este: " + celMaiMareNr(arr));
    }
    public static double media(int[] arr){
        double s = 0;
        for(int el : arr) s+= el;
        double rez = s / arr.length;
        return rez;
    }
    public static int celMaiMareNr(int[] arr){
        int celMaiMare = arr[0];
        for(int el : arr){
            if(celMaiMare < el) celMaiMare = el;
        }
        return celMaiMare;
    }
}
