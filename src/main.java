import Z1.Algorithms1;

public class main {
    public static void main(String[] args) {
        Algorithms1 a = new Algorithms1();
        System.out.println("Wynik potegowania: " + a.power(3, 4));
        System.out.println("Wynik silni: " + a.factorial(30));
        System.out.println("Suma cg: " + a.geoSequence(2, 2, 4));
        System.out.println("Suma ca: " + a.algSequence(2,2,4));
        System.out.println("Czy doskonała: " + a.perfectNum(496));
        System.out.println("NWD: " + a.getNWD(12, 24));
        System.out.println("DtB: " + a.decimalToBinary(12));
        System.out.println("BtD: " + a.binaryToDecimal("1100"));
        System.out.println("Primary: " + a.isPrimary(13));
        System.out.println("Primary: " + a.isPrimary(15));
        a.getPrimaryNumbers(10);

    }
}
