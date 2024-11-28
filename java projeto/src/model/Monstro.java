package model;

public class Monstro extends Personagem{
    private String tipo; //Pra definir se ele é, por exmeplo, um lobo
    private int XP;
    public Monstro(String nome, String tipo, Level level, int vida, int XP){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        this.XP = XP;
        Vida = vida;
    }

    public Monstro(){}






}
