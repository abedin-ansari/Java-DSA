public class Interfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen(); // Using Queen class which implements ChessPlayer interface
        q1.moves();
        
        Beer beer = new Beer(); // Example of a class implementing multiple interfaces
        beer.eats();
    }
}

// Marker interfaces
interface Herbivore {
    void eats();
}

interface Carnivore {
    void eats();
}

// Example of a class implementing "multiple interfaces"
class Beer implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Beer is both herbivore and carnivore.");
    }
}

// Interface with method declaration
interface ChessPlayer {
    void moves(); // Abstract method to be implemented by classes
}

// Queen class implementing the ChessPlayer interface
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Moves up, down, left, right, diagonal");
    }
}

// Rook class implementing the ChessPlayer interface
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Moves up, down, left, right");
    }
}

// King class implementing the ChessPlayer interface
class King implements ChessPlayer {
    public void moves() {
        System.out.println("Moves up, down, left, right, diagonal - (By 1 step)");
    }
}
