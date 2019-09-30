public class NVFactory extends SlotMachineFactory {

    public SlotMachine orderSlot(String type){
        
        SlotMachine newSlot;

        if( type.equals("bonus")){
            newSlot = new NVBonusSlot();
        }
        else if(type.equals("progressive")){
            newSlot = new NVProgressiveSlot();
        }
        else{
            newSlot = new NVStraightSlot();
        }

        return newSlot;
    }
}
