import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String args[]) {

        String[] trees = {"Colorado Blue Spruce", "Douglas Fir", "Balsam Fir", "Fraser Fir"};
        String[] decorations = {"Star", "Ruffles", "Balls Red", "Balls Blue", "Balls Silver", "Ribbons", "Lights", "L.E.D's"};

        Scanner in = new Scanner(System.in);

        int selection = 0;

        Tree my_tree = null;

        while(selection == 0) {

            System.out.println("What kind of tree would you like?");
            int i = 1;
            for(String tree: trees){
                System.out.println(i + ") " + tree);
                i++;
            }
            selection = in.nextInt();

            switch (selection) {
                case 1:
                    my_tree = new ColoradoBlueSpruce();
                    break;
                case 2:
                    my_tree = new DouglasFir();
                    break;
                case 3:
                    my_tree = new BalsamFir();
                    break;
                case 4:
                    my_tree = new FraserFir();
                    break;
                default:
                    System.out.println("Please enter a valid selection");
                    selection = 0;
            }
        }


        selection = -1;
        while(selection != 0) {

            my_tree.printDescription();
            System.out.println("Add Decorations! (0 to stop)");
            int i = 1;
            for (String decoration : decorations) {
                System.out.println(i + ") " + decoration);
                i++;
            }

            selection = in.nextInt();

            switch (selection) {
                case 0:
                    break;
                case 1:
                    my_tree = new Star(my_tree);
                    break;
                case 2:
                    my_tree = new Ruffles(my_tree);
                    break;
                case 3:
                    my_tree = new BallsRed(my_tree);
                    break;
                case 4:
                    my_tree = new BallsBlue(my_tree);
                    break;
                case 5:
                    my_tree = new BallsSilver(my_tree);
                    break;
                case 6:
                    my_tree = new Ribbons(my_tree);
                    break;
                case 7:
                    my_tree = new Lights(my_tree);
                    break;
                case 8:
                    my_tree = new LED(my_tree);
                    break;
                default:
                    System.out.println("Please enter a valid selection");
            }

        }

        System.out.print("Your final tree: ");
        my_tree.printDescription();

    }

}
