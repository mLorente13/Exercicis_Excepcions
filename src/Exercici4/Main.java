package Exercici4;

public class Main {
    public static void main(String[] args) {
        try {
            throw new TestException("El número no s'ha trobat.");
        } catch(TestException e) {
            System.out.println(e.getMessage());
        }

    }
}

class TestException extends Exception {
    String message;

    public TestException(String message) {
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
}

