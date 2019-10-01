public class Driver {

    public static void main(String[] args){
        SlotMachineFactory nv = new NVFactory();
        SlotMachine nv_straight = nv.orderSlot("straight");
        nv_straight.prepare();
        nv_straight.printSlot();
        /*SlotMachineFactory nv_factory = new NVFactory();
        SlotMachineFactory nj_factory = new NJFactory();
        SlotMachineFactory wa_factory = new WAFactory();

        SlotMachine nv_bonus = nv_factory.orderSlot("bonus");
        SlotMachine nj_bonus = nj_factory.orderSlot("bonus");
        SlotMachine wa_bonus = wa_factory.orderSlot("bonus");

        System.out.println("NV Bonus Slot:");
        nv_bonus.printSlot();
        System.out.println();
        System.out.println("NJ Bonus Slot:");
        nj_bonus.printSlot();
        System.out.println();
        System.out.println("WA Bonus Slot:");

        wa_bonus.printSlot();*/

    }
}
