public class Lights extends Decoration {

    public Lights(Tree tree){
        this.tree = tree;
        this.description = "Lights";
        this.price = 5;
        this.has_star = tree.getStar();
    }
}
