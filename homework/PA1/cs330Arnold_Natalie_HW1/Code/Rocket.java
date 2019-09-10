public class Rocket implements WeaponInterface {

    public void sounds() {
        System.out.print("WHEEEEEEEEE");
        for(int i = 0; i < 7; i++){
            try{Thread.sleep(300);}catch(InterruptedException e){System.out.println(e);}
            System.out.print(".");
        }
        System.out.print("BOOM!\n");
    }
}
