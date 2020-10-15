package core;

public class Car {
    //переменная типа String
    public String number;
    //переменная типа int
    public int height;
    //переменная типа double
    public double weight;
    //переменная типа boolean
    public boolean hasVehicle;
    //переменная типа boolean
    public boolean isSpecial;

    public String getNumber()
    {
        return number;
    }
    public int getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public boolean getHasVehicle()
    {
        return hasVehicle;
    }
    public boolean getIsSpecial()
    {
        return isSpecial;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public void setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }
    public void setSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}