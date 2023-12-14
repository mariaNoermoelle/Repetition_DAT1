import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion());
        animals.add(new Parrot());

        for(Animal animal : animals)
        {
            animal.makeSound();
        }

        for(Animal animal : animals)
        {
            if(animal.isMammal)
                System.out.println(animal);
        }

        for(Animal animal : animals)
        {
            if(animal instanceof Lion)
            {
                System.out.println(animal);
            }
        }

    }
}
