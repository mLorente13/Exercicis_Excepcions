public class Exercici1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Llançant excepció");
        } catch (Exception e) {
            System.out.println("Excepcio capturada");
        }
    }
}
