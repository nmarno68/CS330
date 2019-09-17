public class Driver {

    public static void main(String args[]){

        Base old_fashioned = new Bourbon();
        old_fashioned = new Bitters(old_fashioned);
        old_fashioned = new Bitters(old_fashioned);
        old_fashioned = new Cherry(old_fashioned);
        old_fashioned = new Lime(old_fashioned);

        System.out.println(old_fashioned.getDescription() + " has " + old_fashioned.calories());

        Base gimlet = new Vodka();
        gimlet = new Lime(gimlet);
        gimlet =  new Lime(gimlet);

        System.out.println(gimlet.getDescription() + " has " + gimlet.calories());

    }
}
