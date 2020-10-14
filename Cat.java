
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double sumFeed;
    static private int count = 0;
    private boolean checkDead;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        sumFeed = 0;
        checkDead = true;

        count++;
    }

    public void meow()
    {
        if(checkDead) {
            weight = weight - 1;
            //    System.out.println("Meow"); для читабельности результата
        }
    }

    public void feed(Double amount)
    {
        if(checkDead) {
            weight = weight + amount;
            getFeed(amount);
        }
        else
            System.out.println("Cat dead");
    }

    public void drink(Double amount)
    {
        if(checkDead) {
            weight = weight + amount;
        }
        else
            System.out.println("Cat dead");
    }

    public void pee()
    {
        if(checkDead) {
            weight = weight - 10;
            System.out.println("pee");
        }
        else
            System.out.println("Cat dead");
    }

    static public int getCount()
    {
        return count;
    }

    public void minusCount()
    {
        if(checkDead)
        {
            count--;
        }
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
            minusCount();
            checkDead = false;
            return "Dead";
        }
        else if(weight > maxWeight) {
            minusCount();
            checkDead = false;
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