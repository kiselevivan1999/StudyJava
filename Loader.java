
public class Loader
{
    public static void main(String[] args)
    {
        Cat baron = new Cat();
        Cat kia = new Cat();
        Cat kot = new Cat();
        Cat aloe = new Cat();

        baron.feed(15000.0);
        baron.getStatus();
        baron.feed(100.0);

        System.out.println("Живых кошек: " + Cat.getCount());

    }

    public static void PrintWeight(Cat cat)
    {
        System.out.println(cat.getWeight());
    }

    public static void PrintStatus(Cat cat)
    {
        System.out.println(cat.getStatus());
    }

}
