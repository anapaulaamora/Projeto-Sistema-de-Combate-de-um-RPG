import java.util.Scanner;


public class Adversario {
    Scanner scanner = new Scanner(System.in);
    private String adversario;
    private int vida;
    private int dano;
    private int agilidade;
    private int defesa;


    Dados dados = new Dados();


    private void primeirosViloes(){


           System.out.println("Historia.....");
           System.out.println();
           System.out.println("Pressione Enter para continuar...");
           scanner.nextLine();


           System.out.println("Escolha um dos tres para atacar:");
           System.out.println("1. ------");
           System.out.println("2. --------");
           System.out.println("3. ------");
           System.out.println("Escolha o numero do seu adversario: ");




           int escolhaAdversario1 = scanner.nextInt();


           switch(escolhaAdversario1){


              case 1:
              this.adversario = "Kimiko";
              System.out.println("voce atacou a kimiko");
              this.vida = 15;    
              this.agilidade = 8;
              this.defesa = 9;
              this.dano = 8;
 
 
              break;
              case 2:
              this.adversario = "Leitinho";
              System.out.println("voce atacou o leitinho! ");
              this.vida = 10;
              this.agilidade = 7;
              this.defesa = 5;
              this.dano = 7;
 
 
              break;
              case 3:
              this.adversario = "Frances";
              System.out.println("voce atacou o frances! ");
              this.vida = 15;    
              this.agilidade = 8;
              this.defesa = 8;
              this.dano = 5;
              break;


              default:
              System.out.println("Opção inválida.");
              return;


           }
       
           exibirEstatisticas();


    }


    public void segundosViloes(){


        System.out.println("Historia.....");
        System.out.println();
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();


        System.out.println("Escolha um dos dois para atacar:");
        System.out.println("1. ------");
        System.out.println("2. ---------");
        System.out.println("Escolha o numero do seu adversario: ");




        int escolhaAdversario2 = scanner.nextInt();


        switch(escolhaAdversario2){


            case 1:
            this.adversario = "Hughie";
            System.out.println("voce atacou o Hughie");
            this.vida = 11;    
            this.agilidade = 8;
            this.defesa = 7;
            this.dano = 6;
            break;




            case 2:
            this.adversario = "Luz Estrela";
            System.out.println("voce atacou a Luz estrela");
            this.vida = 16;    
            this.agilidade = 8;
            this.defesa = 10;
            this.dano = 10;
            break;


            default:
            System.out.println("Opção inválida.");
            return;


        }


        exibirEstatisticas();


    }




    private void ultimoVilao(){


        System.out.println("Historia.....");
        System.out.println();
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();


        System.out.println("Voce vai enfrentar Bily Bruto");
        this.adversario = "Bruto";
        this.vida = 15;    
        this.agilidade = 10;
        this.defesa = 9;
        this.dano = 12;


        exibirEstatisticas();


    }




    public void exibirEstatisticas() {
        System.out.println("Adversário: " + adversario);
        System.out.println("Vida: " + vida);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Defesa: " + defesa);
        System.out.println("Dano: " + dano);
    }


    @Override
    public String toString() {
        return "Adversario: " + adversario + "\n Vida: " + vida + "\n Agilidade: " + agilidade + "\n Defesa: " + defesa + " \n Dano: " + dano;
    }
}




