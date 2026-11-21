public class Metode {
    public static void main() {
        double ore = 25;
        double oreleLucrateDeMine = 37.5;
//        calculareBrut(8);
//        calculareBrut(ore);
//        calculareBrut(oreleLucrateDeMine);
    }

//    public static void calculareBrut(double ore) {
//        final double RATA_STANDARD = 13.75;
//        double brut;
//        brut = ore * RATA_STANDARD;
//        System.out.println(ore + " ore cu achitare in dolari " + RATA_STANDARD + " pe ora iese $" + brut);
//    }

    public static void calculareBrut(double ore, double rata){
        double brut;
        brut = ore * rata;
        System.out.println(ore + " pe ora $ " + rata + " pe ora este $" + brut);
    }

    public static int giveNumber() {
        return 2;
    }

    public static void login(String username, String token, String password){

    }
}
