package Exercici13;

public class Main {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception();
            } finally {
                // Amb aquest return nomes s'executa el finally exterior
                return;
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
