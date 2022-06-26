public class Pedone extends Pezzo{
    boolean isBianco;
    public Pedone(){
        super(0,0);

    }
    public Pedone(int x, int y, boolean isBianco){
        super(x,y);
        this.isBianco = isBianco;
    }

    @Override
    public String toString() {
        String s;
        if(this.isBianco){
            s = " pb ";
        }
        else{
            s = " pn ";
        }

        return s;
    }

}
