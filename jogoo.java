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
                    System.out.println("/============================================================================================\\\r\n" + //
                                                "||  ____            _ _                ____       _        _            ____  _____ _   _   ||\r\n" + //
                                                "|| / ___|__ _ _ __ (_) |_ __ _  ___   |  _ \\ __ _| |_ _ __(_) __ _     / ___|| ____| | | |  ||\r\n" + //
                                                "||| |   / _` | '_ \\| | __/ _` |/ _ \\  | |_) / _` | __| '__| |/ _` |____\\___ \\|  _| | | | |  ||\r\n" + //
                                                "||| |__| (_| | |_) | | || (_| | (_) | |  __/ (_| | |_| |  | | (_| |_____|__) | |___| |_| |  ||\r\n" + //
                                                "|| \\____\\__,_| .__/|_|\\__\\__,_|\\___/  |_|   \\__,_|\\__|_|  |_|\\__,_|    |____/|_____|\\___/   ||\r\n" + //
                                                "|| ___ __  __|_|__  ____  _____ ____ _____  ___     _______ _     _                         ||\r\n" + //
                                                "|||_ _|  \\/  |  _ \\|  _ \\| ____/ ___|_   _|/ \\ \\   / / ____| |   | |                        ||\r\n" + //
                                                "|| | || |\\/| | |_) | |_) |  _| \\___ \\ | | / _ \\ \\ / /|  _| | |   | |                        ||\r\n" + //
                                                "|| | || |  | |  __/|  _ <| |___ ___) || |/ ___ \\ V / | |___| |___|_|                        ||\r\n" + //
                                                "|||___|_|__|_|_|   |_| \\_\\_____|____/ |_/_/   \\_\\_/  |_____|_____(_)  _                     ||\r\n" + //
                                                "||\\ \\   / /__   ___ ___   / _| ___  ___| |__   ___  _   _    ___     (_) ___   __ _  ___    ||\r\n" + //
                                                "|| \\ \\ / / _ \\ / __/ _ \\ | |_ / _ \\/ __| '_ \\ / _ \\| | | |  / _ \\    | |/ _ \\ / _` |/ _ \\   ||\r\n" + //
                                                "||  \\ V / (_) | (_|  __/ |  _|  __/ (__| | | | (_) | |_| | | (_) |   | | (_) | (_| | (_) |  ||\r\n" + //
                                                "||   \\_/ \\___/ \\___\\___| |_|  \\___|\\___|_| |_|\\___/ \\__,_|  \\___/   _/ |\\___/ \\__, |\\___(_) ||\r\n" + //
                                                "||                                                                 |__/       |___/         ||\r\n" + //
                                                "\\============================================================================================/");
                                                System.out.println("Pressione Enter para continuar...");
                                                scanner.nextLine();  
                                                limpar();
                                                break;
                                                
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }


    }
        private static void exibirintro(){ //intro do jogo
           
            final String AZUL = "\033[34m";
               
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

            System.out.println("Esse jogo RPG ira se passar no universo ficticio de The Boys onde um super eh contratado pela Vougth");
            System.out.println("No entanto, seu sonho sempre foi participar do grupo principal de supers, Os setes, dessa maneira, esta disposto");
            System.out.println("a fazer qualquer coisa para entrar. O super em sua investigaçao descobre que Os setes e a Vougth estao atras de um grupo");
            System.out.println("que caça supers, entao, para ganhar respeito na empresa e entrar para Os setes o 'heroi' vai atras de m@tar os...");
            System.out.println("\n");
            System.out.println(" _____ _   _ _____   ____   _____   ______   \r\n" + //
                                "|_   _| | | | ____| | __ ) / _ \\ \\ / / ___|  \r\n" + //
                                "  | | | |_| |  _|   |  _ \\| | | \\ V /\\___ \\  \r\n" + //
                                "  | | |  _  | |___  | |_) | |_| || |  ___) | \r\n" + //
                                "  |_| |_| |_|_____| |____/ \\___/ |_| |____(_)");
            System.out.println("\n");
                    
            System.out.println("Pressione Enter para voltar ao Menu...");
            scanner.nextLine();  
            limpar();
        }


        private static void iniciarJogo(){


            System.out.println("----------- _   _                       _                  _                                 _                       _            \r\n" + //
                                "| | | | ___  _ __ __ _    __| | ___    ___ _ __(_) __ _ _ __   ___  ___ _   _    (_) ___   __ _  __ _  __| | ___  _ __ \r\n" + //
                                "| |_| |/ _ \\| '__/ _` |  / _` |/ _ \\  / __| '__| |/ _` | '__| / __|/ _ \\ | | |   | |/ _ \\ / _` |/ _` |/ _` |/ _ \\| '__|\r\n" + //
                                "|  _  | (_) | | | (_| | | (_| |  __/ | (__| |  | | (_| | |    \\__ \\  __/ |_| |   | | (_) | (_| | (_| | (_| | (_) | |   \r\n" + //
                                "|_| |_|\\___/|_|  \\__,_|  \\__,_|\\___|  \\___|_|  |_|\\__,_|_|    |___/\\___|\\__,_|  _/ |\\___/ \\__, |\\__,_|\\__,_|\\___/|_|   \r\n" + //
                                "                                                                               |__/       |___/                        \r\n" + //
                                "--------------");
            Jogador jogador = new Jogador();
            jogador.criarPersonagem();
            System.out.println("//SEU PERSONGEM//\n " + jogador);

            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            limpar();

            System.out.println("   ____  _____ _     _____ ____ ___ ___  _   _ _____   ____  _____ _   _ ____    ____   ___  ____  _____ ____  _____ ____   \r\n" + //
                                "  / ___|| ____| |   | ____/ ___|_ _/ _ \\| \\ | | ____| / ___|| ____| | | / ___|  |  _ \\ / _ \\|  _ \\| ____|  _ \\| ____/ ___|  \r\n" + //
                                "  \\___ \\|  _| | |   |  _|| |    | | | | |  \\| |  _|   \\___ \\|  _| | | | \\___ \\  | |_) | | | | | | |  _| | |_) |  _| \\___ \\  \r\n" + //
                                "   ___) | |___| |___| |__| |___ | | |_| | |\\  | |___   ___) | |___| |_| |___) | |  __/| |_| | |_| | |___|  _ <| |___ ___) | \r\n" + //
                                "  |____/|_____|_____|_____\\____|___\\___/|_| \\_|_____| |____/|_____|\\___/|____/  |_|    \\___/|____/|_____|_| \\_\\_____|____/  ");
            System.out.println("\n");

            Arma arma = new Arma();
            arma.adicionarArma(jogador.getDestreza(), jogador.getForca());

            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            limpar();


            System.out.println("   ____  _____ _     _____ ____ ___ ___  _   _ _____   ____  _   _   _         _    ____  __  __    _    ____  _   _ ____      _    \r\n" + //
                                "  / ___|| ____| |   | ____/ ___|_ _/ _ \\| \\ | | ____| / ___|| | | | / \\       / \\  |  _ \\|  \\/  |  / \\  |  _ \\| | | |  _ \\    / \\   \r\n" + //
                                "  \\___ \\|  _| | |   |  _|| |    | | | | |  \\| |  _|   \\___ \\| | | |/ _ \\     / _ \\ | |_) | |\\/| | / _ \\ | | | | | | | |_) |  / _ \\  \r\n" + //
                                "   ___) | |___| |___| |__| |___ | | |_| | |\\  | |___   ___) | |_| / ___ \\   / ___ \\|  _ <| |  | |/ ___ \\| |_| | |_| |  _ <  / ___ \\ \r\n" + //
                                "  |____/|_____|_____|_____\\____|___\\___/|_| \\_|_____| |____/ \\___/_/   \\_\\ /_/   \\_\\_| \\_\\_|  |_/_/   \\_\\____/ \\___/|_| \\_\\/_/   \\_\\");
            System.out.println("\n");
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

            Adversario primeiroAdversario = Adversario.gerarAdversario(0);

            Turnos turno = new Turnos();
            turno.adversario = primeiroAdversario;
            turno.jogador = jogador;
            System.out.println("E o primeiro adversario para o combate eh: ");
            System.out.println(primeiroAdversario);

            Combate combate = new Combate(jogador, primeiroAdversario, turno, vida);
            
            // Iniciar o combate
            combate.iniciarCombate();

            Adversario segundoAdversario = Adversario.gerarAdversario(0);

            turno.adversario = segundoAdversario;
            turno.jogador = jogador;
            System.out.println("O segundo adversario chegou: ");
            System.out.println(segundoAdversario);

            Adversario terceiroAdversario = Adversario.gerarAdversario(0);
            turno.adversario = terceiroAdversario;
            turno.jogador = jogador;
            System.out.println("Voce encontrou o terceiro adversario!");
            System.out.println(terceiroAdversario);

            Adversario quartoAdversario = Adversario.gerarAdversario(0);
            turno.adversario = quartoAdversario;
            turno.jogador = jogador;
            System.out.println("Voce encontrou o quarto adversario!");
            System.out.println(quartoAdversario);

            Adversario quintoAdversario = Adversario.gerarAdversario(1);
            turno.adversario = quintoAdversario;
            turno.jogador = jogador;
            System.out.println("Voce encontrou o quintoadversario!");
            System.out.println(quintoAdversario);

            Adversario sextoAdversario = Adversario.gerarAdversario(2);
            turno.adversario = sextoAdversario;
            turno.jogador = jogador;
            System.out.println("Voce encontrou o ultimo e mais perigoso adversario!");
            System.out.println(sextoAdversario);


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
         

            System.out.println("\n voce,entrou na Vougth e nao aguenta mais as missoes secundarias que lhe dao voce esta atras do seu desejo de entrar nos Setes, voce descubriu que eles estao atras de um grupo que extermina supers. Voce querendo visibilade e respeito vai atras deles.");
            System.out.println();
            System.out.println("Voce com a cara e com a coragem vai atras deles...mas mal espera para uma super aventura.");
            System.out.println("\n");
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
