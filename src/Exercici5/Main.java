package Exercici5;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = 10;
        while(true) {
            try {
                System.out.println(numbers[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("No es pot accedir a l'element " + i + " de l'array.");
                i--;
                continue;
            }
            break;
        }
    }
}
