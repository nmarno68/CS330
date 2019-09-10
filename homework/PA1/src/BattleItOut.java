import java.util.Scanner;

public class BattleItOut {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Unit tank = new Tank();
        Unit grunt = new Grunt();

        System.out.println("Greetings General");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("We've got a training exercise for you.");
        try{Thread.sleep(2500);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("You'll be given one soldier and one tank, see how well you can command them about the field.");
        try{Thread.sleep(2500);}catch(InterruptedException e){System.out.println(e);}

        String training = "Y";
        boolean tank_alive = true;

        while(training.equalsIgnoreCase("Y")){
            System.out.println("Soldier: What are my orders?");
            System.out.print("1) Attack\n2) Flee\nEnter a number: ");
            int command = in.nextInt();
            in.nextLine();

            if(command == 1){
                grunt.issueOrders(new Attack());
                grunt.followOrders();
                grunt.useWeapon();
            }
            else if(command == 2){
                grunt.issueOrders(new Flee());
                grunt.followOrders();
            }
            else{
                System.out.println("Give me a break, I'm really tired I dont want to do error checking so we'll just pretend this never happened.");
            }

            System.out.println("Change weapons? (Y/N)");
            if(in.nextLine().equalsIgnoreCase("Y")){
                System.out.print("1) Axe\n2) Pistol\nEnter a number: ");
                command = in.nextInt();
                in.nextLine();

                if(command == 1){
                    grunt.pickup_newWeapon(new Axe());
                }
                else if (command == 2){
                    grunt.pickup_newWeapon(new Pistol());
                }
                else{
                    System.out.println("Plz no... my program is sad and fragile");
                }
            }

            if(tank_alive){
                System.out.println("Tank: What are my orders?");
                System.out.print("1) Attack\n2) Defend\n3) Self Destruct\nEnter a number: ");
                command = in.nextInt();
                in.nextLine();

                if(command == 1){
                    tank.issueOrders(new Attack());
                    tank.followOrders();
                    tank.useWeapon();
                }
                else if(command == 2){
                    tank.issueOrders(new Defend());
                    tank.followOrders();
                }
                else if(command == 3){
                    tank.issueOrders(new SelfDestruct());
                    tank.followOrders();
                    tank_alive = false;

                }
                else{
                    System.out.println("Give me a break, I'm really tired I dont want to do error checking so we'll just pretend this never happened.");
                }
                if(tank_alive) {
                    System.out.println("Change weapons? (Y/N)");
                    if (in.nextLine().equalsIgnoreCase("Y")) {
                        System.out.print("1) Canon\n2) Laser\n3) Rocket\nEnter a number: ");
                        command = in.nextInt();
                        in.nextLine();

                        if (command == 1) {
                            tank.pickup_newWeapon(new Canon());
                        } else if (command == 2) {
                            tank.pickup_newWeapon(new Laser());
                        } else if (command == 3) {
                            tank.pickup_newWeapon( new Rocket());
                        }
                        else {
                            System.out.println("Plz no... my program is sad and fragile");
                        }
                    }
                }
            }

            System.out.print("Continue Training? (Y/N): ");
            training = in.nextLine();
        }

        System.out.print("Well done general, thanks for your time!\n");


    }
}
