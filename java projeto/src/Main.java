import enums.Classe;
import enums.Raca;
import model.Personagem;
import model.Player;
import service.PessoaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,y,z;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Personagem p = new Player();
        PessoaService ps = new PessoaService();

       do {
           System.out.println("Editor Mestre!");
           System.out.println("-----------------");
           System.out.println("O que deseja fazer?");

           System.out.println("\n1. Criar personagem");
           System.out.println("2. Ver personagens");
           System.out.println("3. Sair");
           y = sc2.nextInt();
           switch (y) {
               case 1:
                   System.out.println("Nome do jogador");
                   ((Player)p).setPlayer_Nome(sc.next());
                   System.out.println("Nome do personagem que deseja criar");
                   p.setNome(sc.next());
                   System.out.println("Raça que deseja ser");
                   System.out.println("1 - Humano,\n2 - Elfo,\n3 - Anão");
                   if (sc2.nextInt() == 1){
                       p.setRaca(Raca.Humanos);
                   } else if (sc2.nextInt() ==2) {
                       p.setRaca(Raca.Elfo);
                   } else if (sc2.nextInt() == 3) {
                       p.setRaca(Raca.Anao);
                   }
                   /*
                    nao gosto da ideia de botar um switch dentro de outro assim tão rapido, mas enfim
                   int escolha = sc.nextInt();
                   switch (escolha) {
                       case 1:
                           p.setRaca(Raca.Humanos);
                           break;
                       case 2:
                           p.setRaca(Raca.Elfo);
                           break;
                       case 3:
                           p.setRaca(Raca.Anao);
                           break;
                   }*/
                   System.out.println("Qual classe deseja?");
                   System.out.println("1 - Guerreiro,\n2 - Mago,\n3 - Druida");
                   if (sc2.nextInt() == 1){
                       p.setClasse(Classe.Guerreiro);
                   } else if (sc2.nextInt() ==2) {
                       p.setClasse(Classe.Mago);
                   } else if (sc2.nextInt() == 3) {
                       p.setClasse(Classe.Druida);
                   }
                   System.out.println("Qual o xp do personagem?");
                   p.setExp(sc.nextInt());
                   System.out.println("Calculando level...");
                   System.out.println("-------------");
                   p.calcularLevel();
                   System.out.println("-------------");
                   System.out.println("Level atualizado");

                   System.out.println("-------------");
                   System.out.println("Agora vamos adicionar seus atributos");
                   System.out.println("-------------");
                   System.out.println("Valor de Força");
                   ((Player) p).setForca(sc.nextInt());
                   System.out.println("Valor de Destreza");
                   ((Player) p).setDestreza(sc.nextInt());
                   System.out.println("Vaçor de Constituição");
                   ((Player) p).setConstituicao(sc.nextInt());
                   System.out.println("Valor de Inteligência");
                   ((Player) p).setInteligencia(sc.nextInt());
                   System.out.println("Valor de Sabedoria");
                   ((Player) p).setSabedoria(sc.nextInt());
                   System.out.println("Valor de Carisma");
                   ((Player) p).setCarisma(sc.nextInt());

                   System.out.println("...Estamos calculando o total de pontos de vida...");
                   p.calcularVida();
                   System.out.println("Vida atualizada");
                   System.out.println("Cadastrando personagem");
                   System.out.println("------------");
                   ps.cadastrarPersonagem(p);
                   System.out.println("------------");
                   System.out.println("Cadastro bem-sucedido");

                   System.out.println("\nPersonagem criado:");
                   p.Detalhes();









           }
           System.out.println("Deseja sair? Digite [4]");
           x = sc2.nextInt();
       }while (x != 4);


    }
}
/*
trabalhar com base nisso

        System.out.println("Editor de Ficha RPG");
        System.out.println("-----------------");
        boolean continuar = true;

        while (continuar) {
            System.out.println("O que deseja fazer?");
            System.out.println("1. Criar personagem");
            System.out.println("2. Ver personagens");
            System.out.println("3. Sair");

            int escolha = sc.nextInt();
            sc.nextLine(); // Para consumir a quebra de linha após a entrada do número

            switch (escolha) {
                case 1:
                    // Criar um jogador
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.nextLine();

                    System.out.println("Escolha a raça (1 - Humano, 2 - Elfo, 3 - Anão, 4 - Orc):");
                    int escolhaRaca = sc.nextInt();
                    Raca raca = escolherRaca(escolhaRaca);

                    System.out.println("Escolha a classe (1 - Guerreiro, 2 - Mago, 3 - Ladrao, 4 - Clerigo):");
                    int escolhaClasse = sc.nextInt();
                    Classe classe = escolherClasse(escolhaClasse);

                    System.out.println("Escolha o nível (1 - Iniciante, 2 - Intermediário, 3 - Avançado):");
                    int escolhaNivel = sc.nextInt();
                    Level level = escolherNivel(escolhaNivel);

                    System.out.println("Digite a quantidade de vida:");
                    int vida = sc.nextInt();

                    sc.nextLine(); // Consumir o '\n' restante

                    System.out.println("Digite o nome do jogador:");
                    String playerNome = sc.nextLine();

                    // Atribuindo valores fixos para os atributos
                    System.out.println("Digite o valor de Força:");
                    int forca = sc.nextInt();

                    System.out.println("Digite o valor de Destreza:");
                    int destreza = sc.nextInt();

                    System.out.println("Digite o valor de Constituição:");
                    int constituicao = sc.nextInt();

                    System.out.println("Digite o valor de Inteligência:");
                    int inteligencia = sc.nextInt();

                    System.out.println("Digite o valor de Sabedoria:");
                    int sabedoria = sc.nextInt();

                    System.out.println("Digite o valor de Carisma:");
                    int carisma = sc.nextInt();

                    // Criando o jogador com base nas entradas
                    Player player = new Player(nome, raca, classe, level, vida, playerNome, 0, forca, destreza, constituicao, inteligencia, sabedoria, carisma);

                    // Exibindo informações do personagem
                    System.out.println("\nPersonagem criado:");
                    System.out.println(player.toString());
                    ps.cadastrarPersonagem(player);

                    break;

                case 2:
                    System.out.println("Verificando personagens...");
                    System.out.println(ps.listar());
                    break;

                case 3:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        sc.close(); // Fechando o scanner ao final
    }

    private static Raca escolherRaca(int escolha) {
        switch (escolha) {
            case 1: return Raca.HUMANO;
            case 2: return Raca.ELFO;
            case 3: return Raca.ANAO;
            case 4: return Raca.ORC;
            default: return Raca.HUMANO;
        }
    }

    private static Classe escolherClasse(int escolha) {
        switch (escolha) {
            case 1: return Classe.GUERREIRO;
            case 2: return Classe.MAGO;
            case 3: return Classe.LADRAO;
            case 4: return Classe.CLERIGO;
            default: return Classe.GUERREIRO;
        }
    }

    private static Level escolherNivel(int escolha) {
        switch (escolha) {
            case 1: return Level.INICIANTE;
            case 2: return Level.INTERMEDIARIO;
            case 3: return Level.AVANCADO;
            default: return Level.INICIANTE;
        }
    }





}

 */
