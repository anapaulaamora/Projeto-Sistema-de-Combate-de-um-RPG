import java.util.Random;

public class Adversario {
    private String adversario;
    private int vida;
    private int dano;
    private int agilidade;
    private int defesa;

    public Adversario(String adversario, int vida, int dano, int agilidade, int defesa) {
        this.adversario = adversario;
        this.vida = vida;
        this.dano = dano;
        this.agilidade = agilidade;
        this.defesa = defesa;
    }

    public int getDano() {
        return dano;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int novaVida) {
        this.vida = novaVida;
    }

    public String getNome() {
        return adversario;
    }

    public static Adversario gerarAdversario(int rodada) {
        Random random = new Random();
        int escolha;

        if (rodada == 0) {
            escolha = random.nextInt(3);
            if (escolha == 0) {
                return new Adversario("Kimiko", 18, 6, 3, 2);
            } else if (escolha == 1) {
                return new Adversario("Leitinho", 19, 5, 2, 3);
            } else {
                return new Adversario("Françe", 17, 4, 2, 1);
            }
        } else if (rodada == 1) {
            escolha = random.nextInt(2);
            if (escolha == 0) {
                return new Adversario("Hughie", 20, 5, 5, 3);
            } else {
                return new Adversario("Luz Estrela", 21, 6, 14, 3);
            }
        } else if (rodada == 2) {
            return new Adversario("Billy Brutos", 22, 7, 4, 4);
        } else {
            throw new IllegalArgumentException("Rodada inválida: " + rodada);
        }
    }

    @Override
    public String toString() {
        return "Adversario: " + adversario + 
               "\nVida: " + vida + 
               "\nAgilidade: " + agilidade + 
               "\nDefesa: " + defesa + 
               "\nDano: " + dano;
    }
}





