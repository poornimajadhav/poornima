class Bun
{

    String name = "Sweetbun";
    String teast = "Sweet";
    int prize = 10;
    int numpices = 2;

    Bun()
    {
        System.out.println("Running Bun main ");

    }
}

class BunRunner
{
    public static void main(String [] args)
    {
        Bun ref = new Bun();

        System.out.println("Name of the Bun is : "+ref.name);
        System.out.println("The teast of the Bun is :"+ref.teast);
        System.out.println("Prize of the Bun is : "+ref.prize);
        System.out.println("The number of pices are : "+ref.numpices);
    }
}