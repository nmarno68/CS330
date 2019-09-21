import java.util.ArrayList;

abstract public class Tree {

    float price;
    String description;
    boolean has_star;

    public float getPrice(){ return this.price; }

    public ArrayList<String> getDescription(){
        ArrayList<String> desc = new ArrayList<String>();
        desc.add(this.description);
        return desc;
    }

    public void setStar(){ this.has_star = true;}

    public boolean getStar(){return this.has_star;}

    public void printDescription(){

        ArrayList<String> descriptions = this.getDescription();
        String tree_description;
        tree_description = descriptions.get(0);
        descriptions.remove(0);

        while(descriptions.remove(""));

        String decorations;
        if(descriptions.size() == 0){
            decorations = "nothing";
        }
        else {
            decorations = String.join(", ", descriptions);
        }

        System.out.println(tree_description + " decorated with " + decorations + " costs $" + this.getPrice());

    }
}
