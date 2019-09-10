public class Unit {

    OrderInterface orders;
    WeaponInterface weapon;

    public void followOrders(){ orders.execute(); }
    public void useWeapon(){ weapon.sounds(); }

    public void issueOrders( OrderInterface newOrders){
        orders = newOrders;
    }
    public void pickup_newWeapon( WeaponInterface newWeapon){
        weapon = newWeapon;
    }
}
