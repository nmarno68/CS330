import A2.GuitarInterface;

public class GameCharacter {

    A2.GuitarInterface guitar;
    SoloInterface solo;

    public void playGuitar()
    {
        guitar.play();
    }

    public void playSolo() {
        solo.play();
    }

    public void changeGuitar(GuitarInterface newGuitar)
    {
        guitar = newGuitar;
    }
}
