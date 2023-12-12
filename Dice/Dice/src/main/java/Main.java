public class Main
{
    public static void main(String[] args)
    {
     Die die = new Die(6);
     Cup cup = new Cup(die, die);
        System.out.println(die.rollDie());
        System.out.println(cup.howManyIdenticalThrows(10));
        //System.out.println(cup.result(10));
    }
}
