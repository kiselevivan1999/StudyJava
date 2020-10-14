
public class Loader
{
    public static void main(String[] args)
    {
        Cat baron = new Cat();

        baron.feed(150.0);

        for(int i = 0; i < 5; i++)
        {
            baron.pee();
        }

        System.out.println("Всего съедено: " + baron.getFeed(0.0));
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
