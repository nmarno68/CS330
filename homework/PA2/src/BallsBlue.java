public class BallsBlue extends Decoration {

    public BallsBlue(Tree tree){
        this.tree = tree;
        this.description = "Blue Balls";
        this.price = 2;
        this.has_star = tree.getStar();
    }
}
