package Exercici7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            throwExceptions();
        } catch (E1Exception | E2Exception | E3Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void throwExceptions() throws E1Exception, E2Exception, E3Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Quina excepció vols llançar? (1, 2 o 3)");
        int n = s.nextInt();

        switch (n) {
            case 1: throw new E1Exception();
            case 2: throw new E2Exception();
            case 3: throw new E3Exception();
        }
    }
}

class E1Exception extends Exception {
    String message = "E1Exception";

    public String getMessage() {
        return message;
    }
}

class E2Exception extends Exception {
    String message = "E2Exception";

    public String getMessage() {
        return message;
    }
}

class E3Exception extends Exception {
    String message = "E3Exception";

    public String getMessage() {
        return message;
    }
}
