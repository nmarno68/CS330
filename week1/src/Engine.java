public class Engine {

    private int size;
    private int horsepower;

    public int GetSize(){return size;}
    public void SetSize(int newSize) {size = newSize;}

    public int GetHorsepower(){return horsepower;}
    public void SetHorsepower(int newHorsepower){horsepower = newHorsepower;}

    public Engine(){
        size = 0;
        horsepower = 0;
    }
}
