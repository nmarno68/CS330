public abstract class SlotMachine {

    public Cabinet cabinet;
    public Payment payment;
    public Display display;
    public GPU gpu;
    public OS os;

    abstract SlotMachine prepare();

    public void printSlot(){
    }

}
