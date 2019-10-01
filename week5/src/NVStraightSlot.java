public class NVStraightSlot extends SlotMachine{
    SlotTypeFactory nvFactory;
    public NVStraightSlot(){}
    public NVStraightSlot(SlotTypeFactory factory){
        this.nvFactory = factory;

    }
    public SlotMachine prepare(){
        return nvFactory.createStraight();
    }
    public void printSlot(){
        System.out.println("Cabinet: " + cabinet.toString() + "\nPayment: " + payment.toString() + "\nDisplay: " + display.toString() + "\nGPU: " + gpu.toString() + "\nOS: " + os.toString());
    }
}
