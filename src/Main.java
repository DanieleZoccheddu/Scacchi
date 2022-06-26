public class Main {
    public static void main(String[] args) {
        Scacchiera s = new Scacchiera();
        s.stampaScacchiera();
        s.sposta(6,3,4,3); //muovi il pedone bianco
        s.stampaScacchiera();
        s.sposta(1,3,3,3); //muovi il pedone nero
        s.stampaScacchiera();
    }

}
