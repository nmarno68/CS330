public class Wheel {

    private int diameter;
    private int pressure;

    public Wheel()
    {
        diameter = 0;
        pressure = 0;
    }

    public int GetDiameter() {return diameter;}
    public void SetDiameter(int newDiameter) {diameter = newDiameter;}

    public int getPressure() {return pressure;}
    public void setPressure(int newPressure) {pressure = newPressure;}
}
