package service;

import enums.Classe;
import enums.Raca;
import enums.Level;
import model.Personagem;

public class Monstro extends Personagem {
    private String tipo; //Pra definir se ele é, por exmeplo, um lobo
    private int XP;
    public Monstro(String nome,Raca raca,Classe classe, Level level, int vida, String tipo, int XP){
        super(nome,raca = null, classe = null, level, vida);
        this.tipo = tipo;
        this.XP = XP;
    }

    public Monstro(){}


    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}