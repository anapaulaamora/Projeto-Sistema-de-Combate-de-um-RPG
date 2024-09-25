import java.util.Scanner;

public class Arma{

    private String arma;
    private int constanteLeve = 2;
    private int constantePesada = 3;
    private float dano;

    Dados dados = new Dados();

     public void adicionarArma(int destreza, int forca){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha sua superpoder:");
        System.out.println("1. ----- ---------- ");
        System.out.println("2. ----- -----------");
        System.out.println("3. ----------");
        System.out.println("4. ------------ -- ----- - -----");
        System.out.print("Escolha o número da superpoder: ");


        int escolhaArma = scanner.nextInt();


        switch (escolhaArma) {
            case 1:
                this.arma = " Ficar invisivel (leve)";
                System.out.println("--------------SEU PODER------------");
                calcularDanoLeve(destreza);
            

                break;
            case 2:
                this.arma = " Dedos raios-laser (Pesada)";
                System.out.println("-------------SEU PODER-------------");
                calcularDanoPesado(forca);


                break;
            case 3:
              this.arma = " Superforca (leve)";
              System.out.println("-------------SEU PODER-----------------");
              calcularDanoLeve(destreza);
               

              break;
            case 4:
               this.arma = " Especialista em armas - fuzil (Pesada)";
              System.out.println("-----------SEU PODER---------------");
              calcularDanoPesado(forca);

              break;
            default:
                System.out.println("------------Voce nao e um super, ira receber uma adaga--------------");
                this.arma = "Adaga (Leve)";
                break;


        }


        System.out.println("poder escolhida: " + arma);
        System.out.println("Dano calculado: " + dano);

    }

    public float getDano() {
        return dano;
    }

    private void calcularDanoLeve(int destreza) {
        int d6 = dados.rolarD6();
        int d4 = dados.rolarD4();
        dano = d6+ d6 + d4 + destreza + constanteLeve;
    }

    private void calcularDanoPesado(int forca) {
        int d12 = dados.rolarD12();
        dano = d12 + (1.5f * forca) + constantePesada;

    }


    @Override
    public String toString(){
        return "poder: " +arma;
    
}

}
