public class Alfiere extends Pezzo {
    boolean isBianco;
    public Alfiere(){
        super(0,0);

    }
    public Alfiere(int x, int y, boolean isBianco){
        super(x,y);
        this.isBianco = isBianco;
    }

    @Override
    public String toString() {
        String s;
        if(this.isBianco){
            s = " ab ";
        }
        else{
            s = " an ";
        }

        return s;
    }
}