package model;

import enums.Raca;
import enums.Level;
import enums.Classe;

public abstract class Personagem implements MetodosUP {
    protected String nome;
    protected Raca raca;
    protected Classe classe;
    protected Level level;
    protected int Vida;

    public Personagem(String nome, Raca raca, Classe classe, Level level, int vida) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.level = level;
        Vida = vida;
    }

    public Personagem() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }


    // To-string
    public void Detalhes() {
        System.out.println(getNome());
        System.out.println(getRaca());
    }

    //metodos da ficha

    @Override
    public void calcularLevel() {

    }

    @Override
    public void maisXP(int xpGanho) {

    }

    @Override
    public void calcularVida() {

    }
}
