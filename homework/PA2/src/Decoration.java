import java.util.ArrayList;

abstract public class Decoration extends Tree{

    Tree tree;

    public float getPrice(){ return this.price + this.tree.getPrice(); }

    public ArrayList<String> getDescription(){
        ArrayList<String> desc = this.tree.getDescription();
        desc.add(this.description);
        return desc;
    }

    public boolean getStar(){ return this.has_star; }

}
