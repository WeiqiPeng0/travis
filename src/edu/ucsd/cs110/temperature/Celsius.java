package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    private final float value;
    public Celsius(float t)
    {
        super(t);
        this.value = t;
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.value);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((float)(this.value*1.8+32));
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+this.value+" C";
    }
}
