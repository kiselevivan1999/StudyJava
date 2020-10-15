
public class Loader
{
    public static void main(String[] args)
    {
        final int SIZE_ARRAY = 3;

        Cat[] cats = new Cat[SIZE_ARRAY];

        for(int i = Cat.getCount(); i < SIZE_ARRAY; i++) {
            cats[i] = getKitten();
            PrintWeight(cats[i]);
        }
    }

    private static Cat getKitten()
    {
        Cat cat = new Cat(1100.0);
        return cat;
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
