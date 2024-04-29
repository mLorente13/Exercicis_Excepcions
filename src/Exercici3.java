public class Exercici3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No es pot accedir a l'element 5 de l'array.");
        }
    }
}
