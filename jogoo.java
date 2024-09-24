import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class Jogo {
   private static Scanner scanner = new Scanner (System.in);
    public static void main (String[] args){
     
        exibirintro();


        while(true) { //escolhas
            Menu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    iniciarJogo();
                    break;
                case 2:
                 limpar();
                    Historia();
                    break;
                case 3:
                    System.out.println("Capitao Patria-SEU IMPRESTAVEL!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }




    }
        private static void exibirintro(){ //intro do jogo
           
            final String AZUL = "\033[34m";
            final String RESET = "\033[0m";
               
             System.out.println(AZUL + "                                                                                                   \r\n" + //
                                  "                       o       8                    8          8 8 8                           o  8 8 \r\n" + //
                                  "                               8                    8         '  ' 8                              ' '\r\n" + //
                                  ".oPYo. .oPYo. ooYoYo. o8 odYo. 8oPYo. .oPYo.   .oPYo8 .oPYo.       8oPYo. .oPYo. oPYo. .oPYo. o8    \r\n" + //
                                  "8    ' .oooo8 8' 8  8  8 8' `8 8    8 8    8   8    8 8    8       8    8 8oooo8 8  `' 8    8  8    \r\n" + //
                                  "8    . 8    8 8  8  8  8 8   8 8    8 8    8   8    8 8    8       8    8 8.     8     8    8  8    \r\n" + //
                                  "`YooP' `YooP8 8  8  8  8 8   8 8    8 `YooP'   `YooP' `YooP'       8    8 `Yooo' 8     `YooP'  8    \r\n" + //
                                  ":.....::.....:..:..:..:....::....:::..:.....::::.....::.....::::::..:::..:.....:..:::::.....::..:::\r\n" + //
                                  ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n" + //
                                  ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
             System.out.println();
             System.out.println("Pressione Enter para continuar...");
             scanner.nextLine();  
             limpar();
        }




        private static void Menu() { //menu do jogo
            System.out.println("Menu Principal:");
            System.out.println("1. Começar Jogo");
            System.out.println("2. Contar História");
            System.out.println("3. Fechar Jogo");
            System.out.print("Escolha uma opção: ");
        }




        private static void Historia(){ //historia do jogo


            System.out.println("Esse jogo RPG ira se passar no universo ficticio de The Boys onde um super e contratado pela Vougth");
            System.out.println("No entanto, seu sonho e participar do grupo principal de supers, Os setes, dessa maneira, esta disposto");
            System.out.println("disposto a qualquer custo entrar. O super em sua investigaçao descobre que Os setes e a Vougth esta atras de um grupo");
            System.out.println("que caça supers, entao, para ganhar respeito na empresa e entrar para Os setes o 'heroi' vai atras de m@tar os the boys.");
            System.out.println("Pressione Enter para voltar ao Menu...");
            scanner.nextLine();  
            limpar();
        }




        private static void iniciarJogo(){




            System.out.println("------------ CRIE SEU JOGADOR --------------");
            Jogador jogador = new Jogador();
            jogador.criarPersonagem();
            System.out.println("//SEU PERSONGEM//\n " + jogador);


            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            limpar();




            System.out.println("------------ SELECIONE SEUS PODERES --------------");
            Arma arma = new Arma();
            arma.adicionarArma(jogador.getDestreza(), jogador.getForca());


            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            limpar();




            System.out.println("------------ SELECIONE SUA ARMADURA --------------");
            Armadura armadura = new Armadura();
            armadura.adicionarArmadura(jogador.getConstituicao());


            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            limpar();
           


            Vida vida = new Vida();
            vida.vida();


            System.out.println("//SEU PERSONAGEM//\n" + jogador);
            System.out.println("\n//SEU PODERES//\n" + arma);
            System.out.println("\n//SEU TRAJE //\n" + armadura);
            System.out.println("\n//SEUS PONTOS DE VIDA//\n" + vida.getPontosVida());


            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            limpar();
           


             primeiraHistoria();




        }  
       
        private static void limpar(){


            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }


        private static void primeiraHistoria(){




            System.out.println("\n");
            System.out.println("   _____      _         _                                _           _                      __      __               _   _      ");
            System.out.println("  / ____|    (_)       | |                              (_)         | |                     \\ \\    / /              | | | |     ");
            System.out.println(" | (___   ___ _  __ _  | |__   ___ _ __ ___ ________   ___ _ __   __| | ___    _ __   __ _   \\ \\  / /__  _   _  __ _| |_| |__   ");
            System.out.println("  \\___ \\ / _ \\ |/ _` | | '_ \\ / _ \\ '_ ` _ \\______\\ \\ / / | '_ \\ / _` |/ _ \\  | '_ \\ / _` |   \\ \\/ / _ \\| | | |/ _` | __| '_ \\  ");
            System.out.println("  ____) |  __/ | (_| | | |_) |  __/ | | | | |      \\ V /| | | | | (_| | (_) | | | | | (_| |    \\  / (_) | |_| | (_| | |_| | | | ");
            System.out.println(" |_____/ \\___| |\\__,_| |_.__/ \\___|_| |_| |_|       \\_/ |_|_| |_|\\__,_|\\___/  |_| |_|\\__,_|     \\/ \\___/ \\__,_|\\__, |\\__|_| |_| ");
            System.out.println("            _/ |                                                                                                __/ |           ");
            System.out.println("           |__/                                                                                                |___/            ");
         


            System.out.println("\n voce,entrou na Vougth e nao aguenta mais as missoes secundarias que lhe dao voce esta atras do seu desejo de entrar nos Setes, voce descubriu que eles estao atras de um grupo que extermina supers, voce querendo visibilade e respeito vai atras deles");
            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            limpar();


           }


        public void gamerover(){


            limpar();


            System.out.println("  _____          __  __ ______ _____     ______      ________ _____  ");
            System.out.println(" / ____|   /\\   |  \\/  |  ____|  __ \\   / __ \\ \\    / /  ____|  __ \\ ");
            System.out.println("| |  __   /  \\  | \\  / | |__  | |__) | | |  | \\ \\  / /| |__  | |__) |");
            System.out.println("| | |_ | / /\\ \\ | |\\/| |  __| |  _  /  | |  | |\\ \\/ / |  __| |  _  / ");
            System.out.println("| |__| |/ ____ \\| |  | | |____| | \\ \\  | |__| | \\  /  | |____| | \\ \\ ");
            System.out.println(" \\_____/_/    \\_\\_|  |_|______|_|  \\_\\  \\____/   \\/   |______|_|  \\_\\");
            System.out.println();


            System.out.println("Pressione Enter para voltar ao menu...");
            scanner.nextLine();


            limpar();


           
        }
       


    }



