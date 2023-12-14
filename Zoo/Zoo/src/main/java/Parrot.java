public class Parrot extends Animal {
    public Parrot() {
        super(false);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("What's up??");
    }

    public String toString()
    {
        return "Parrot";
    }
}
