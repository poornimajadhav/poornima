class Biscuit
{

    String name = "Gooday";
    String teast = "Sweet";
    int prize = 10;
    int numpices = 8;

    Biscuit()
    {
        System.out.println("Running Biscuit main ");

    }
}

class BiscuitRunner
{
    public static void main(String [] args)
    {
        Biscuit ref = new Biscuit();

        System.out.println("Name of the biscuit is : "+ref.name);
        System.out.println("The teast of the biscuit is :"+ref.teast);
        System.out.println("Prize of the biscuit is : "+ref.prize);
        System.out.println("The number of pices are : "+ref.numpices);
    }
}