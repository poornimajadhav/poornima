class Bread
{

    String name = "Softbread";
    String teast = "Sweet";
    int prize = 50;
    int numpices = 20 ;

    Bread()
    {
        System.out.println("Running Bread main ");

    }
}

class BreadRunner
{
    public static void main(String [] args)
    {
        Bread ref = new Bread();

        System.out.println("Name of the Bread is : "+ref.name);
        System.out.println("The teast of the Bread is :"+ref.teast);
        System.out.println("Prize of the Bread is : "+ref.prize);
        System.out.println("The number of pices are : "+ref.numpices);
    }
}