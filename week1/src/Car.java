public class Car extends Vehicle {

    private Engine engine;

    public Car(){
        engine = new Engine();
        SetNumWheels(4);
        SetSound("HonkHonk");
        SetColor("white");

    }

    public Engine GetEngine(){return engine;}
    public void SetEngine(Engine newEngine){engine = newEngine;}
}
