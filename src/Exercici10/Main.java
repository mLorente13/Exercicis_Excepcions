package Exercici10;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < 10; i++) {
            try {
                add(numbers, i);
            } catch (ArrayFullException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void add(int[] numbers, int i) throws ArrayFullException {
        if (i >= numbers.length) {
            throw new ArrayFullException("Array is full");
        }
        numbers[i] = i;
    }
}

class ArrayFullException extends Exception {
    String message;

    public ArrayFullException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
