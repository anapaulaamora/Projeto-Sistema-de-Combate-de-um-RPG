import java.util.Random;


class Dados {
    private Random random = new Random();


    public int rolarD6() {
        return random.nextInt(6) + 1; // Gera um número entre 1 e 6
    }


    public int rolarD12() {
        return random.nextInt(12) + 1; // Gera um número entre 1 e 12
    }


    public int rolarD4() {
        return random.nextInt(4) + 1; // Gera um número entre 1 e 4
    }
public float dano(){
        return random.nextFloat() * 5.0f + 15.0f;
    }
}
