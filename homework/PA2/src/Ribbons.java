public class Ribbons extends Decoration {

    public Ribbons(Tree tree){
        this.tree = tree;
        this.description = "Ribbons";
        this.price = 2;
        this.has_star = tree.getStar();
    }
}
