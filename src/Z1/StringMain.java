package Z1;

import controller.StringController;

public class StringMain {
    public static void main(String[] args) {
        StringController sc = new StringController();
        System.out.println("Contains a: " + sc.isCharacter('a'));
        System.out.println("Contains y: " + sc.isCharacter('y'));
        System.out.println("Number of o: " + sc.countAllCharacters('o'));
        // Napisz metode która zwraca ile jest wielkich liter w tekscie
        // 65 - 90 ASCII
        System.out.println("Number of upper cases: " + sc.countUpperCases());
        // Napisz metode reverse
        System.out.println("Reverse: " + sc.reverse());
    }
}
