public class NJFactory extends SlotMachineFactory {

    public SlotMachine orderSlot(String type){

        SlotMachine newSlot;

        if( type.equals("bonus")){
            newSlot = new NJBonusSlot();
        }
        else if(type.equals("progressive")){
            newSlot = new NJProgressiveSlot();
        }
        else{
            newSlot = new NJStraightSlot();
        }

        return newSlot;
    }
}
