import java.util.Random;

public class Cup
{
    Die die1 = new Die(6);
    Die die2 = new Die(6);

    public Cup(Die die1, Die die2)
    {
        this.die1=die1;
        this.die2=die2;
    }
    public int howManyIdenticalThrows(int times)
    {
        int identical = 0;
        for(int i = 0; i<times; i++) {
            if (die1.rollDie() == die2.rollDie()) {
            identical++;
            }
        }
        return identical;
    }

   /* public int[] result (int times)
    {
        int[] rollResult = new int[times];
        for(int i = 0; i<times; i++) {
            int result1 = die1.rollDie();
            int result2 = die2.rollDie();
            int totalResults = result1+result2;
            rollResult[i] = totalResults;
        }
        return rollResult;
    }

    */
}
