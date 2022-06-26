public class Cavallo extends Pezzo{
    boolean isBianco;
    public Cavallo(){
        super(0,0);

    }
    public Cavallo(int x, int y, boolean isBianco){
        super(x,y);
        this.isBianco = isBianco;
    }

    @Override
    public String toString() {
        String s;
        if(this.isBianco){
            s = " cb ";
        }
        else{
            s = " cn ";
        }

        return s;
    }
}