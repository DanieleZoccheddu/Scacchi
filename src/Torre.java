public class Torre extends Pezzo{
    boolean isBianco;
    public Torre(){
        super(0,0);

    }
    public Torre(int x, int y, boolean isBianco){
        super(x,y);
        this.isBianco = isBianco;
    }

    @Override
    public String toString() {
        String s;
        if(this.isBianco){
            s = " tb ";
        }
        else{
            s = " tn ";
        }

        return s;
    }
}
