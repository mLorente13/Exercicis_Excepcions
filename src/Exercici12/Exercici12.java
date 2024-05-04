package Exercici12;

public class Exercici12 {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception();
            } finally {
                System.out.println("finally");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
