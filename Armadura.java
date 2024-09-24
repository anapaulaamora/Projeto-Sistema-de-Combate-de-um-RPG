import java.util.Scanner;


public class Armadura {


    private String armadura;
    private int constante = 2;
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
               this.armadura = "Feito pela vougth (pesado)";
               System.out.println("-------------SEU TRAJE foi feito pela Vougth---------------");
               defesa(constituicao);


                break;
            case 2:
               this.armadura = "Feito pelo seu avó (leve)";
               System.out.println("-------------SEU TRAJE foi feito pela avó------------------");
               defesa(constituicao);
               break;
            case 3:
               this.armadura = "Voce encontrou seu traje no lixo :) (leve)";
               System.out.println("--------------SEU TRAJE foi encontrado no lixo----------------");
               defesa(constituicao);


                break;


            default:
                System.out.println("Opção inválida.");
                return;    
        }


        System.out.println("armadura escolhida: " + armadura);
        System.out.println("defesa: " + defesa);


    }


    private void defesa(int constituicao){


          defesa = constante +(int) (1.5 * constituicao);




    }



    @Override
    public String toString(){
        return "Traje: " +armadura;
   
}
}
