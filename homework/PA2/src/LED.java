public class LED extends Decoration {

    public LED(Tree tree){
        this.tree = tree;
        this.description = "L.E.D's";
        this.price = 10;
        this.has_star = tree.getStar();
    }
}
