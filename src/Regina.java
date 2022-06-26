public class Regina extends Pezzo {
    boolean isBianco;
    public Regina(){
        super(0,0);

    }
    public Regina(int x, int y, boolean isBianco){
        super(x,y);
        this.isBianco = isBianco;
    }

    @Override
    public String toString() {
        String s;
        if(this.isBianco){
            s = " qb ";
        }
        else{
            s = " qn ";
        }

        return s;
    }
}