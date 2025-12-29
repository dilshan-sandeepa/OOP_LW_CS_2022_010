package LW_03.Q2;

public class Temperature {
    private double celsius;

    public void setFahrenheit(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double getCelsius() {
        return celsius;
    }
}


