package Exercici3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Intentant accedir a un element fora del rang.");
        }
    }
}
