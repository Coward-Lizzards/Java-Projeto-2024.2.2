package model;
import enums.Raca;
import enums.Level;
import enums.Classe;


public class Player extends Personagem{
    private String Player_Nome;
    private int exp;
    private int Forca;
    private int Destreza;
    private int Constituicao;
    private int Inteligencia;
    private int Sabedoria;
    private int Carisma;

    public Player(String nome, Raca raca, Classe classe, Level level, int vida, String player_Nome, int exp, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super(nome, raca, classe, level, vida);
        this.Player_Nome = player_Nome;
        this.exp = exp;
        this.Forca = forca;
        this.Destreza = destreza;
        this.Constituicao = constituicao;
        this.Inteligencia = inteligencia;
        this.Sabedoria = sabedoria;
        this.Carisma = carisma;
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

    public int getForca() {
        return Forca;
    }

    public void setForca(int forca) {
        Forca = forca;
    }

    public int getDestreza() {
        return Destreza;
    }

    public void setDestreza(int destreza) {
        Destreza = destreza;
    }

    public int getConstituicao() {
        return Constituicao;
    }

    public void setConstituicao(int constituicao) {
        Constituicao = constituicao;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        Inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return Sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        Sabedoria = sabedoria;
    }

    public int getCarisma() {
        return Carisma;
    }

    public void setCarisma(int carisma) {
        Carisma = carisma;
    }

    // To-string


    @Override
    public void calcularLevel() {
        super.calcularLevel();
    }

    @Override
    public void maisXP(int xpGanho) {
        super.maisXP(xpGanho);
        setExp(getExp() + xpGanho);
        calcularLevel();
    }

    @Override
    public void calcularVida() {
        super.calcularVida();
    }
}
