public class Vehicle {

    private int wheels;
    private String color;
    private int year;
    private Wheel wheelType;
    private String sound;

    public void MakeSound()
    {
        System.out.println(sound);
    }


    public int GetNumWheels() { return wheels; }
    protected void SetNumWheels(int newNumWheels) {wheels = newNumWheels;}

    public Wheel GetWheel(){return wheelType;}
    public void SetWheel(Wheel newWheel){wheelType = newWheel;}

    public String GetColor() {return color;}
    public void SetColor(String newColor) {color = newColor;}

    public String GetSound() {return sound;}
    public void SetSound(String newSound) {sound = newSound;}

}
