public class Re extends Pezzo {
    boolean isBianco;
    public Re(){
        super(0,0);

    }
    public Re(int x, int y, boolean isBianco){
        super(x,y);
        this.isBianco = isBianco;
    }

    @Override
    public String toString() {
        String s;
        if(this.isBianco){
            s = " kb ";
        }
        else{
            s = " kn ";
        }

        return s;
    }
}