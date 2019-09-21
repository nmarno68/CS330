public class Star extends Decoration {

    public Star(Tree tree){
        this.tree=tree;
        if(this.tree.getStar()){
            this.description = "";
            this.price = 0;
            System.out.println("Tree already has a star!");
        }
        else{
            this.description = "Star";
            this.price = 4;
        }
        this.has_star = true;
    }

}
