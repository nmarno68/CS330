public class Cherry extends Decorator {

    public Cherry(Base thing) {
        this.base = thing;
        this.description = " Cherry ";
        this.calories = 40;
    }

    public float calories(){
        return this.base.calories() + this.calories;
    }

    public String getDescription(){ return this.description + this.base.getDescription();}
}
