public class Bike extends Vehicle {

    private int torque;

    public Bike(){
        torque = 0;
        SetNumWheels(2);
        SetSound("RingRing");

    }

    public int GetTorque() { return torque; }
    public void SetTorque( int newTorque) {torque = newTorque;}
}
