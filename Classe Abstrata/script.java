abstract class Animal {
    // Método abstrato
    abstract void fazerSom();

    // Método comum
    void dormir() {
        System.out.println("O animal está dormindo.");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au au!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.fazerSom();
        cachorro.dormir();
    }
}