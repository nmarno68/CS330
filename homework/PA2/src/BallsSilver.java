public class BallsSilver extends Decoration {

    public BallsSilver(Tree tree){
        this.tree = tree;
        this.description = "Silver Balls";
        this.price = 3;
        this.has_star = tree.getStar();
    }
}
