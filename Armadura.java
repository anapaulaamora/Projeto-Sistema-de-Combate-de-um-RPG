import java.util.Scanner;

public class Armadura {

    private String armadura;
    private int constanteleve = 2;
    private int constanteP = 4;
    private int constanteM = 3;
    private int defesa;

    public void adicionarArmadura(int constituicao){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu traje: ");
        System.out.println("1. ----- ---- ------");
        System.out.println("2. ----- ---- --- --");
        System.out.println("3. ---- ----- -- ----");
        System.out.println("Escolha o numero do seu traje: ");

        int escolhaArmadura = scanner.nextInt();

        switch(escolhaArmadura){
            case 1: 
               this.armadura = "Feito pela vougth";
               System.out.println("-------------SEU TRAJE foi feito pela Vougth---------------");
               defesa(constituicao);

                break;
            case 2:
               this.armadura = "Feito pelo seu avó ";
               System.out.println("-------------SEU TRAJE foi feito pela avó------------------");
               defesa(constituicao);
               break;
            case 3:
               this.armadura = "Voce encontrou seu traje no lixo :)";
               System.out.println("--------------SEU TRAJE foi encontrado no lixo----------------");
               defesa(constituicao);

                break;

            default:
                System.out.println("Opção inválida.");
                return;    
        }

        System.out.println("armadura escolhida: " + armadura);
        System.out.println("defesa: \n" + defesa);

    }

    private void defesa(int constituicao){

          defesa = constanteleve +(int) (1.5 * constituicao);
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String toString(){
        return "Traje: " +armadura;
    
}

}
