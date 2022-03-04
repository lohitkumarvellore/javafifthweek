public class Coin
{
     private static int TAILS = 0;
     private int value = 0;
     public void flip()
     {
        if (Math.random() < 0.5)
        {
            value = 0;
        }
        else
        {
            value = 1;
        }
     }
    public boolean isTails()
    {
        return value == TAILS;
    }
    public String toString()
    {
        if (value == TAILS)
            return "Tails";
        else
            return "Head";
    }
    public static void main(String[] args)
    {
        Coin myCoin = new Coin();
        for (int i = 0; i < 10; i++)
        {
            myCoin.flip();
            System.out.println(myCoin);
            System.out.println(myCoin.isTails());
        }
    }
}