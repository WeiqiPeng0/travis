package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    private final float value;
    public Fahrenheit(float t)
    {
        super(t);
        this.value = t;
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float)((this.value-32.0)/1.8));
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.value);
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+this.value+" F";
    }
}
