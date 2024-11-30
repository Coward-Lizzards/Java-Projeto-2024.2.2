package service;

import enums.Classe;
import enums.Raca;
import model.Personagem;
import model.Player;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,y,z;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Personagem p = new Player();

       do {
           System.out.println("Editor Mestre!");
           System.out.println("-----------------");
           System.out.println("O que deseja fazer?");

           System.out.println("\n1. Criar personagem");
           System.out.println("2. Criar monstro");
           System.out.println("3. Ver personagens");
           System.out.println("4. Sair");
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
            System.out.println("2. Criar monstro");
            System.out.println("3. Ver personagens");
            System.out.println("4. Sair");

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

                    break;

                case 2:
                    // Criar um monstro
                    System.out.println("Digite o nome do monstro:");
                    String nomeMonstro = sc.nextLine();

                    System.out.println("Escolha o tipo de monstro (ex: Lobo, Dragão):");
                    String tipoMonstro = sc.nextLine();

                    System.out.println("Escolha o nível (1 - Iniciante, 2 - Intermediário, 3 - Avançado):");
                    int nivelMonstro = sc.nextInt();
                    Level levelMonstro = escolherNivel(nivelMonstro);

                    System.out.println("Digite a quantidade de vida:");
                    int vidaMonstro = sc.nextInt();

                    System.out.println("Digite o valor de XP do monstro:");
                    int xpMonstro = sc.nextInt();

                    // Criando o monstro
                    Monstro monstro = new Monstro(nomeMonstro, tipoMonstro, levelMonstro, vidaMonstro, xpMonstro);

                    // Exibindo informações do monstro
                    System.out.println("\nMonstro criado:");
                    System.out.println(monstro.toString());

                    break;

                case 3:
                    System.out.println("Verificando personagens...");
                    // Aqui você pode implementar uma lista para armazenar personagens e monstros e depois exibi-los
                    break;

                case 4:
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