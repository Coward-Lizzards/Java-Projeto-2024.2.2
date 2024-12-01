package service;
import java.util.ArrayList;
import model.Personagem;

public class PessoaService {
    private ArrayList<Personagem> personagens = new ArrayList<>();


    //POST
    public void cadastrarPessoa(Personagem p) {

        personagens.add(p);
        System.out.println("cadastrada com sucesso!");

    }

    //GET
    public ArrayList<Personagem> listar() {

        return personagens;

    }

    public void atualizar(String nome, String novoNome) {
        for (Personagem personagem : personagens) {

            if (personagem.getNome().equalsIgnoreCase(nome)) {
                personagem.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");

            } else {
                System.out.println("Pessoa não foi encontrada.");

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