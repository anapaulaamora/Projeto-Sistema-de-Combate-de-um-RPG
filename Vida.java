public class Vida {

    Dados dados = new Dados();

    private int pontosVida;
    private int constante = 5;
    private int pontosVidaMaximos;
    private int novaVida;


    public void vida(){

        int d6 = dados.rolarD6();

     pontosVida = d6 + d6 + d6 + constante;

    }

    public int getPontosVida() { 
        return pontosVida;
    }
    public void setVida(int novaVida) {
        this.pontosVida = novaVida;
    }

    @Override
    public String toString(){
        return "PV: " +pontosVida;
    
}

}
