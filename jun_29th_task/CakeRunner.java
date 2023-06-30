class Cake 
{
    String caketype ="chacoalte";
    int weight = 2;
    String ingredients;
    int prize=500;

    Cake()
    {
        System.out.println("Runnning cake main");
    }
}


class Cakerunner
{
    public static void main(String[] args)
    {
        Cake ref = new Cake();


        System.out.println("Cake flaver is :  "+ref.caketype);
        System.out.println("The weight of the cake is : "+ref.weight);
        System.out.println("The ingredients used in the : "+ref.ingredients);
        System.out.println("The prize for each kg of cake is : "+ref.prize);
}

}