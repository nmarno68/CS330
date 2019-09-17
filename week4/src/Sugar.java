public class Sugar extends Decorator {

    public Sugar(Base thing) {
        this.base = thing;
        this.description = " Sugar ";
        this.calories = 300;
    }

    public float calories(){
        return this.base.calories() + this.calories;
    }

    public String getDescription(){ return this.description + this.base.getDescription();}
}
