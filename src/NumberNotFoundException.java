public class NumberNotFoundException extends Exception {
    public static void main(String[] args) throws NumberNotFoundException {
        try {
            throw new NumberNotFoundException("El número no s'ha trobat.");
        } catch(NumberNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    String exceptionMessage;
    public NumberNotFoundException(String message) {
        exceptionMessage = message;
    }

    public String getMessage() {
        return exceptionMessage;
    }
}
