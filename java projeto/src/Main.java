import enums.Classe;
import enums.Level;
import enums.Raca;
import model.Personagem;
import model.Player;
import service.PessoaService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,y,w,z;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Personagem p = new Player();
        Personagem p2 = new Player("Joao","Celebrinbor",Raca.Anao,Classe.Druida, Level.NIVEL_1,10,1,15,12,14,10,10,10);
        PessoaService ps = new PessoaService();
        ps.cadastrarPersonagem(p2);

       do {
           System.out.println("Editor Mestre!");
           System.out.println("-----------------");
           System.out.println("O que deseja fazer?");

           System.out.println("\n1. Criar personagem");
           System.out.println("2. Ver personagens");
           System.out.println("3. Atualizar personagens");
           System.out.println("4. Deletar personagens");
           System.out.println("5. Sair");
           y = sc2.nextInt();
           switch (y) {
               case 1:
                   System.out.println("Nome do jogador");
                   ((Player)p).setPlayer_Nome(sc.next());
                   System.out.println("Nome do personagem que deseja criar");
                   p.setNome(sc.next());
                   System.out.println("Raça que deseja ser");
                   System.out.println("[1]-Humano,\n[2]-Elfo,\n[3]-Anão,\n[4]-Dragonato,\n[5]-Tiefling,\n[6]-Meio-Elfo,\n[7]-Halfling,\n[8]-Gnomo,\n[9]-Meio-orc");
                   z = sc2.nextInt();
                   switch (z) {
                       case 1:
                           p.setRaca(Raca.Humanos);
                           break;
                       case 2:
                           p.setRaca(Raca.Elfo);
                           break;
                       case 3:
                           p.setRaca(Raca.Anao);
                           break;
                       case 4:
                           p.setRaca(Raca.Draconato);
                           break;
                       case 5:
                           p.setRaca(Raca.Tiefling);
                           break;
                       case 6:
                           p.setRaca(Raca.MeioElfo);
                           break;
                       case 7:
                           p.setRaca(Raca.Halfling);
                           break;
                       case 8:
                           p.setRaca(Raca.Gnomo);
                           break;
                       case 9:
                           p.setRaca(Raca.MeioOrc);
                           break;
                   }
                   System.out.println("Qual classe deseja?");
                   System.out.println("[1]-Barbaro,\n[2]-Bardo,\n[3]-Clérigo,\n[4]-Druida,\n[5]-Guerreiro,\n[6]-Monje,\n[7]-Paladino,\n[8]-Patrulheiro,\n[9]-Ladino,\n[10]-Feiticeiro,\n[11]-Bruxo,\n[12]-Mago");
                   w = sc.nextInt();
                   switch (w) {
                       case 1:
                           p.setClasse(Classe.Barbaro);
                           break;
                       case 2:
                           p.setClasse(Classe.Bardo);
                           break;
                       case 3:
                           p.setClasse(Classe.Clerigo);
                           break;
                       case 4:
                           p.setClasse(Classe.Druida);
                           break;
                       case 5:
                           p.setClasse(Classe.Guerreiro);
                           break;
                       case 6:
                           p.setClasse(Classe.Monje);
                           break;
                       case 7:
                           p.setClasse(Classe.Paladino);
                           break;
                       case 8:
                           p.setClasse(Classe.Patrulheiro);
                           break;
                       case 9:
                           p.setClasse(Classe.Ladino);
                           break;
                       case 10:
                           p.setClasse(Classe.Feiticeiro);
                           break;
                       case 11:
                           p.setClasse(Classe.Bruxo);
                           break;
                       case 12:
                           p.setClasse(Classe.Mago);
                           break;
                   }
                   System.out.println("Qual o Nivel do personagem?");
                   p.setLevel(Level.getLevelPorNumero(sc.nextInt()));
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

                   break;
               case 2:
                   System.out.println("Verificando personagens...");
                   ps.listar();
                   break;
               case 3:
                   System.out.println("Digite o nome da pessoa que deseja atualizar: ");
                   String nomeatualizar = sc.next();
                   ps.atualizar(nomeatualizar);
                   System.out.println("Nome do jogador");
                   ((Player)p).setPlayer_Nome(sc.next());
                   System.out.println("Nome do personagem que deseja criar");
                   p.setNome(sc.next());
                   System.out.println("Raça que deseja ser");
                   System.out.println("[1]-Humano,\n[2]-Elfo,\n[3]-Anão,\n[4]-Dragonato,\n[5]-Tiefling,\n[6]-Meio-Elfo,\n[7]-Halfling,\n[8]-Gnomo,\n[9]-Meio-orc");
                   z = sc2.nextInt();
                   switch (z) {
                       case 1:
                           p.setRaca(Raca.Humanos);
                           break;
                       case 2:
                           p.setRaca(Raca.Elfo);
                           break;
                       case 3:
                           p.setRaca(Raca.Anao);
                           break;
                       case 4:
                           p.setRaca(Raca.Draconato);
                           break;
                       case 5:
                           p.setRaca(Raca.Tiefling);
                           break;
                       case 6:
                           p.setRaca(Raca.MeioElfo);
                           break;
                       case 7:
                           p.setRaca(Raca.Halfling);
                           break;
                       case 8:
                           p.setRaca(Raca.Gnomo);
                           break;
                       case 9:
                           p.setRaca(Raca.MeioOrc);
                           break;
                   }
                   System.out.println("Qual classe deseja?");
                   System.out.println("[1]-Barbaro,\n[2]-Bardo,\n[3]-Clérigo,\n[4]-Druida,\n[5]-Guerreiro,\n[6]-Monje,\n[7]-Paladino,\n[8]-Patrulheiro,\n[9]-Ladino,\n[10]-Feiticeiro,\n[11]-Bruxo,\n[12]-Mago");
                   w = sc.nextInt();
                   switch (w) {
                       case 1:
                           p.setClasse(Classe.Barbaro);
                           break;
                       case 2:
                           p.setClasse(Classe.Bardo);
                           break;
                       case 3:
                           p.setClasse(Classe.Clerigo);
                           break;
                       case 4:
                           p.setClasse(Classe.Druida);
                           break;
                       case 5:
                           p.setClasse(Classe.Guerreiro);
                           break;
                       case 6:
                           p.setClasse(Classe.Monje);
                           break;
                       case 7:
                           p.setClasse(Classe.Paladino);
                           break;
                       case 8:
                           p.setClasse(Classe.Patrulheiro);
                           break;
                       case 9:
                           p.setClasse(Classe.Ladino);
                           break;
                       case 10:
                           p.setClasse(Classe.Feiticeiro);
                           break;
                       case 11:
                           p.setClasse(Classe.Bruxo);
                           break;
                       case 12:
                           p.setClasse(Classe.Mago);
                           break;
                   }
                   System.out.println("Qual o Nivel do personagem?");
                   p.setLevel(Level.getLevelPorNumero(sc.nextInt()));
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
               case 4:
                   System.out.print("Digite o nome da pessoa que deseja deletar: ");
                   String nomeDeletar = sc.next();
                   ps.deletar(nomeDeletar);
           }
           System.out.println("Refazer? Digite [1]");
           System.out.println("Deseja sair? Digite [5]");
           x = sc2.nextInt();
       }while (x != 5);


    }
}
