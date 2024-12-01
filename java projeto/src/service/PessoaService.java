package service;
import java.util.ArrayList;
import model.Personagem;

public class PessoaService {
    private ArrayList<Personagem> personagens = new ArrayList<>();


    //POST
    public void cadastrarPersonagem(Personagem p) {

        personagens.add(p);
        System.out.println("cadastrada com sucesso!");

    }

    //GET
    public void listar() {
        if (personagens.isEmpty()) {
            System.out.println("Nenhum personagem cadastrado.");
        } else {
            for (Personagem p : personagens) {
                System.out.println(p);
            }
        }
    }
    public void atualizar(String nome) {
        for (int i = 0; i < personagens.size(); i++) {

            if (personagens.get(i).getNome().equalsIgnoreCase(nome)) {
                personagens.remove(i);
                System.out.println("Localizado!");
            } else{
                System.out.println("Não encontrado");
            }
        }
    }

    public void deletar (String nome){

        for (int i = 0; i < personagens.size(); i++) {

            if (personagens.get(i).getNome().equalsIgnoreCase(nome)) {
                personagens.remove(i);
                System.out.println("Deletado com sucesso!");

            } else{
                System.out.println("Não encontrado");
            }
        }
    }
}