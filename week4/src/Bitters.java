public class Bitters extends Decorator {


    public Bitters(Base thing) {
        this.base = thing;
        this.description = " Bitters ";
        this.calories = 20;
    }

    public float calories(){
        return this.base.calories() + this.calories;
    }

    public String getDescription(){ return this.description + this.base.getDescription();}
}
