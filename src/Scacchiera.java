public class Scacchiera {
    private Pezzo[][] scacchiera;
    private Pezzo p0; //il pezzo vuoto
    private String stringa = "";
    public Scacchiera(){
        scacchiera = new Pezzo[8][8];
        posizionaPezzi();
    }

    public void aggiungiPezzo(int x, int y, Pezzo p){
        this.scacchiera[x][y] = p;
    }



    public Pezzo getP(int x, int y) {
        return scacchiera[x][y];
    }

    public void stampaScacchiera(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                stringa += (this.getP(i,j)).toString() + " ";
                if(j==7){
                    System.out.println(stringa);
                    stringa = "";
                }

            }
        }
    }

    private void posizionaPezzi(){
        Pedone p = new Pedone();
        Torre t = new Torre();
        Cavallo c = new Cavallo();
        Alfiere a = new Alfiere();
        Regina q = new Regina();
        Re k = new Re();

        for(int i = 0; i < 8; i++){ // posiziona le celle vuote
            for(int j = 0; j < 8; j++){
                p0 = new Pezzo(i,j);
                this.aggiungiPezzo(i,j,p0);
            }
        }

        // posiziona i pedoni
        for(int i = 0; i < 8; i++){ // posiziona le celle vuote
            p = new Pedone(1,i,false);
            this.aggiungiPezzo(1,i,p);
            p = new Pedone(6,i,true);
            this.aggiungiPezzo(6,i,p);
        }

        // posiziona le torri
        t = new Torre(0,0,false);
        this.aggiungiPezzo(0,0,t);
        t = new Torre(0,7,false);
        this.aggiungiPezzo(0,7,t);
        t = new Torre(7,0,true);
        this.aggiungiPezzo(7,0,t);
        t = new Torre(7,7,true);
        this.aggiungiPezzo(7,7,t);

        //posiziona i cavalli
        c = new Cavallo(0,1,false);
        this.aggiungiPezzo(0,1,c);
        c = new Cavallo(0,6,false);
        this.aggiungiPezzo(0,6,c);
        c = new Cavallo(7,1,true);
        this.aggiungiPezzo(7,1,c);
        c = new Cavallo(7,6,true);
        this.aggiungiPezzo(7,6,c);

        //posiziona alfiere

        a = new Alfiere(0,2,false);
        this.aggiungiPezzo(0,2,a);
        a = new Alfiere(0,5,false);
        this.aggiungiPezzo(0,5,a);
        a = new Alfiere(7,2,true);
        this.aggiungiPezzo(7,2,a);
        a = new Alfiere(7,5,true);
        this.aggiungiPezzo(7,5,a);

        //posiziona regine
        q = new Regina(0,3,false);
        this.aggiungiPezzo(0,3,q);
        q = new Regina(7,3,true);
        this.aggiungiPezzo(7,3,q);

        //posiziona re
        k = new Re(0,4,false);
        this.aggiungiPezzo(0,4,k);
        k = new Re(7,4,true);
        this.aggiungiPezzo(7,4,k);

    }





}
