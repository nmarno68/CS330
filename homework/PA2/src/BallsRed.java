public class BallsRed extends Decoration {

    public BallsRed(Tree tree){
        this.tree = tree;
        this.description = "Red Balls";
        this.price = 1;
        this.has_star = tree.getStar();
    }
}
