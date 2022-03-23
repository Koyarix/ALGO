public class Utilisateur {

    private String pseudo;
    private int terrain;
    private double VMA;C

    public Utilisateur (String pseudo, double VMA, int terrain){
        this.pseudo=pseudo;
        this.terrain=terrain;
        this.VMA=VMA;
    }

    ///GETTERS///
    public String getPseudo() {
        return pseudo;
    }
    public double getVMA() {
        return VMA;
    }
    public int getTerrain() {
        return terrain;
    }
    ///SETTERS///
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public void setTerrain(int terrain) {
        this.terrain = terrain;
    }
    public void setVMA(double VMA) {
        this.VMA = VMA;
    }
    ///AFFICHAGE///
    public String toString(){
        return pseudo;
    }

}
