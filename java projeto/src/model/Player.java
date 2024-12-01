package model;
import enums.Raca;
import enums.Level;
import enums.Classe;
import enums.Atributo;

public class Player extends Personagem{
    private String Player_Nome;
    private int Forca;
    private int Destreza;
    private int Constituicao;
    private int Inteligencia;
    private int Sabedoria;
    private int Carisma;

    public Player(String player_Nome, String nome, Raca raca, Classe classe, Level level, int vida,  int exp, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super(nome, raca, classe, level, vida, exp);
        this.Player_Nome = player_Nome;
        setAtributo(Atributo.FORCA, forca);
        setAtributo(Atributo.DESTREZA, destreza);
        setAtributo(Atributo.CONSTITUICAO, constituicao);
        setAtributo(Atributo.INTELIGENCIA, inteligencia);
        setAtributo(Atributo.SABEDORIA, sabedoria);
        setAtributo(Atributo.CARISMA, carisma);
    }

    public Player() {

    }


    public String getPlayer_Nome() {
        return Player_Nome;
    }

    public void setPlayer_Nome(String player_Nome) {
        Player_Nome = player_Nome;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setForca(int forca) {
        setAtributo(Atributo.FORCA, forca);
    }

    public void setDestreza(int destreza) {
        setAtributo(Atributo.DESTREZA, destreza);
    }

    public void setConstituicao(int constituicao) {
        setAtributo(Atributo.CONSTITUICAO, constituicao);
    }

    public void setInteligencia(int inteligencia) {
        setAtributo(Atributo.INTELIGENCIA, inteligencia);
    }

    public void setSabedoria(int sabedoria) {
        setAtributo(Atributo.SABEDORIA, sabedoria);
    }

    public void setCarisma(int carisma) {
        setAtributo(Atributo.CARISMA, carisma);
    }

    // To-string
}
