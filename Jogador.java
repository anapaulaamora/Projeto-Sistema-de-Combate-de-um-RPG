import java.util.Scanner;


class Jogador {
    private String nome;
    private int forca;
    private int agilidade;
    private int destreza;
    private int constituicao;




    public void criarPersonagem() {
        Scanner scanner = new Scanner(System.in);




        System.out.print("Digite o nome do seu personagem: ");
        this.nome = scanner.nextLine();




        System.out.print("\n-------------- ATRIBUTOS ---------------\n");
        System.out.print("\nVoce possui 15 pontos de tributos, destruibua-os com sabedoria e de acordo com seu personagem:\n");
        while (true) {
            System.out.print("Força: ");
            this.forca = scanner.nextInt();
            System.out.print("Agilidade: ");
            this.agilidade = scanner.nextInt();
            System.out.print("Destreza: ");
            this.destreza = scanner.nextInt();
            System.out.print("Constituição: ");
            this.constituicao = scanner.nextInt();


            if (forca + agilidade + destreza + constituicao == 15) {
                break;
           
            } else {
                System.out.println("A soma dos atributos deve ser igual a 15. Tente novamente.");
            }
        }
    }


    public int getForca() {
        return forca;
    }


    public int getDestreza() {
        return destreza;
    }


    public int getConstituicao(){
        return constituicao;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + "\n Força: " + forca + "\n Agilidade: " + agilidade + "\n Destreza: " + destreza + " \n Contituicao: " + constituicao;
    }
}
