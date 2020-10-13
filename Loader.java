
public class Loader
{
    public static void main(String[] args)
    {
        Cat baron = new Cat();
        Cat kotlin = new Cat();
        Cat fox = new Cat();
        Cat geep = new Cat();
        Cat xiaomi = new Cat();
        Cat google = new Cat();

        System.out.print("Вес голодных котов: ");
        PrintWeight(baron);
        PrintWeight(kotlin);

        baron.feed(1025.5);
        kotlin.feed(16678.8);

        System.out.print("Вес сытых котов: ");
        PrintWeight(baron);
        PrintWeight(kotlin);

        System.out.print("Кот переел: ");
        PrintStatus(kotlin);

        while(true)
        {
            xiaomi.meow(); //функция вызывается без мяуканья
            if(xiaomi.getStatus() == "Dead")
            {
                break;
            }
        }

        System.out.print("Кот перемяукал: ");
        PrintStatus(xiaomi);

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
