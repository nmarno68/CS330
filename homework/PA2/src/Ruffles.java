public class Ruffles extends Decoration{

    public Ruffles(Tree tree){
        this.tree = tree;
        this.description = "Ruffles";
        this.price = 1;
        this.has_star = tree.getStar();
    }
}
