public class NVFactory extends SlotMachineFactory {

    public SlotMachine orderSlot(String type){

        SlotMachine newSlot;
        SlotTypeFactory factory = new NVSlotType();
        if( type.equals("bonus")){
            newSlot = new NVStraightSlot(factory);
        }
        else if(type.equals("progressive")){
            newSlot = new NVStraightSlot(factory);
        }
        else{
            newSlot = new NVStraightSlot(factory);
        }

        return newSlot;
    }
}
