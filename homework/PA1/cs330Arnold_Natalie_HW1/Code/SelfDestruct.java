public class SelfDestruct implements OrderInterface {

    public void execute() {

        String[] farewell = {"Tell ", "my ", "wife"};
        String[] farewell2 = {"that ", "I ", "love ", "her"};

        for(int i = 0; i < farewell.length; i++){
            try{Thread.sleep(200);}catch(InterruptedException e){System.out.println(e);}
            System.out.print(farewell[i]);
        }

        for(int i = 0; i < 5; i++){
            try{Thread.sleep(400);}catch(InterruptedException e){System.out.println(e);}
            System.out.print(".");
        }

        for(int i = 0; i < farewell2.length; i++){
            try{Thread.sleep(200);}catch(InterruptedException e){System.out.println(e);}
            System.out.print(farewell2[i]);
        }

        try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("\nBOOOOOOOOOOOOOOOM!!!!!!!!!");

    }
}
