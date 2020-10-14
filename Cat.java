
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double sumFeed;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        sumFeed = 0;

    }

    public void meow()
    {
        weight = weight - 1;
    //    System.out.println("Meow"); для читабельности результата
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        getFeed(amount);
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public void pee()
    {
        weight = weight - 10;
        System.out.println("pee");
    }

    public Double getFeed(double amount)
    {
        return sumFeed = sumFeed + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}