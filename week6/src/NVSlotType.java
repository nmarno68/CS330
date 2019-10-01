public class NVSlotType implements SlotTypeFactory{
    public SlotMachine createStraight(){
        SlotMachine slot = new NVStraightSlot();
        slot.cabinet = new largeCabinet();
        slot.display = new reelsDisplay();
        slot.payment = new ticketPayment();
        slot.gpu = new armGPU();
        slot.os = new linuxOS();
        return slot;
    }

    public SlotMachine createBonus() {
        SlotMachine slot = null;
        slot.cabinet = new smallCabinet();
        slot.display = new crtDisplay();
        slot.payment = new ticketPayment();
        slot.gpu = new x86GPU();
        slot.os = new linuxOS();
        return slot;

    }

    public SlotMachine createProgressive() {
        SlotMachine slot = null;
        slot.cabinet = new largeCabinet();
        slot.display = new reelsDisplay();
        slot.payment = new ticketPayment();
        slot.gpu = new armGPU();
        slot.os = new androidOS();
        return slot;

    }
}
