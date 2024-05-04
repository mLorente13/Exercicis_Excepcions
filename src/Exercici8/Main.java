package Exercici8;

public class Main {
    public static void main(String[] args) {

    }

    private static void g() throws G1Exception {
        throw new G1Exception();
    }

    private static void f() throws F1Exception {
        try {
            g();
        } catch (G1Exception e) {
            throw new F1Exception();
        }
    }
}

class G1Exception extends Exception {}

class F1Exception extends Exception {}
