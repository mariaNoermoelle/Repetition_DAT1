public class Lion extends Animal
{
    public Lion()
    {
        super(true);

    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Rooar");
    }

    public String toString()
    {
        return "Lion";
    }
}
