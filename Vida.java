public class Vida {
    Dados dados = new Dados();




    private int pontosVida;
    private int constante = 2;


    public Vida() {
        vida();  // Chama o método vida() no construtor
    }


    // Método que calcula os pontos de vida
    public void vida() {
        int d6 = rolarD6();  // Certifique-se que o método rolarD6 exista
        pontosVida = d6 + d6 + d6 + constante;
    }


    // Método fictício para rolar um D6 (substitua conforme necessário)
    public int rolarD6() {
        // Simulando o rolar de um dado de 6 lados
        return (int) (Math.random() * 6) + 1;
    }




     public int getPontosVida() {
        return pontosVida;
    }












    @Override
    public String toString(){
        return "PV: " +pontosVida;
   
}
}
