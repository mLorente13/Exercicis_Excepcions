public class Exercici2 {
    public static void main(String[] args) {
        String message = null;

        try {
            message.toLowerCase();
        } catch (Exception e) {
            System.out.println("El missatge no és pot convertir a minúscules.");
        }
    }
}
