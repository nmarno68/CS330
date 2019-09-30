public class WAFactory extends SlotMachineFactory {
    public SlotMachine orderSlot(String type){
        
        SlotMachine newSlot;

        if( type.equals("bonus")){
            newSlot = new WABonusSlot();
        }
        else if(type.equals("progressive")){
            newSlot = new WAProgressiveSlot();
        }
        else{
            newSlot = new WAStraightSlot();
        }

        return newSlot;
    }
}
