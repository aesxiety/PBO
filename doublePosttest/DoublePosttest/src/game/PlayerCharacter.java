package game;

public class PlayerCharacter extends GameCharacter {
    @Override
    public void move() {
        System.out.println("PlayerCharacter is moving.");
    }

    @Override
    public void attack() {
        System.out.println("PlayerCharacter is attacking.");
    }
}


