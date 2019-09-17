public class Lime extends Decorator{

    public Lime(Base thing) {
        this.base = thing;
        this.description = " Lime ";
        this.calories = 2;
    }

    public float calories(){
        return this.base.calories() + this.calories;
    }

    public String getDescription(){ return this.description + this.base.getDescription();}
}
