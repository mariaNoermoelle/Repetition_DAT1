import java.util.Random;

public class Die
{

    private int sides;

    public Die(int sides)
    {
        this.sides=sides;
    }

    public int rollDie()
    {
        Random random = new Random();
        int roll = 1;
        roll = random.nextInt(sides+1);
        return roll;
    }
}
