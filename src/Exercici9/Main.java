package Exercici9;


public class Main {
    public static void main(String[] args) {

    }

    private static void g() throws G1Exception {
        throw new G1Exception();
    }

    private static void f() {
        try {
            g();
        } catch (G1Exception e) {
            throw new RuntimeException();
        }
    }
}

class G1Exception extends Exception {}
