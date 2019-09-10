public class Tank extends Unit {

    public Tank(){
        weapon = new Canon();
        orders = new SelfDestruct();
    }
}
