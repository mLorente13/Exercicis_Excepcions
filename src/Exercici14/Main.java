package Exercici14;

public class Main {
    public static void main(String[] args) {
        Animal a = new MuteBird();
        // Com ara el mètode makeSound pot llançar una excepció, cal capturar-la
        try {
            a.makeSound();
        } catch (muteException e) {
            System.out.println("Aquest animal no té so");
        }
    }
}
class muteException extends Exception {}
abstract class Animal {
    // El mètode makeSound de la classe animal no llança cap excepció
    // Afegim el throws muteException perquè la classe MuteBird pugui llançar-la
    abstract void makeSound() throws muteException;
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
class MuteBird extends Animal {
    @Override
    void makeSound() throws muteException {
        throw new muteException();
    }
}
