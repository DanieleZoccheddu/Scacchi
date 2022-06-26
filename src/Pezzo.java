public class Pezzo {
    private int posizioneX;
    private int posizioneY;

    public Pezzo(int x, int y){
        this.posizioneX = x;
        this.posizioneY = y;
    }

    @Override
    public String toString() {
        String s = " *  ";
        return s;
    }
}
