package model;

import enums.Atributo;
import enums.Raca;
import enums.Level;
import enums.Classe;
import java.util.EnumMap;


public abstract class Personagem implements MetodosUP {
    protected String nome;
    protected Raca raca;
    protected Classe classe;
    protected Level level;
    protected int exp;
    protected int Vida;
    protected EnumMap<Atributo, Integer> atributos = new EnumMap<>(Atributo.class);

    public Personagem(String nome, Raca raca, Classe classe, Level level, int vida, int exp) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.level = (level != null) ? level : Level.NIVEL_1;
        this.Vida = vida;
        this.exp = exp;

        //setar atributos base começando de 10
        for (Atributo atributo : Atributo.values()) {
            this.atributos.put(atributo, 10);
        }
    }

    public Personagem() {}




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

    public int getExp() {return exp;}

    public void setExp(int exp) {this.exp = exp;}

    // metodos para acessar e modificar os atributos
    @Override
    public int getAtributo(Atributo atributo) {
        return atributos.getOrDefault(atributo, 0);
    }

    @Override
    public void setAtributo(Atributo atributo, int valor) {
        atributos.put(atributo, valor);
    }

    @Override
    public void incrementarAtributo(Atributo atributo, int incremento) {
        atributos.put(atributo, atributos.getOrDefault(atributo, 0) + incremento);
    }


    // Exibe os detalhes do personagem
    @Override
    public void Detalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("Classe: " + getClasse());
        System.out.println("Level: " + getLevel());
        System.out.println("Vida: " + getVida());
        System.out.println("Atributos:");
        for (Atributo atributo : Atributo.values()) {
            System.out.println(atributo + ": " + getAtributo(atributo));
        }
    }

    //metodos da ficha


    // Métodos abstratos ou a serem implementados
    @Override
    public void calcularLevel() {
        // Lógica para calcular o level
        System.out.println("Calculando level...");
    }

    @Override
    public void calcularVida() {
        if (this.level == null) {  // Verifica se o level é null
            this.level = Level.NIVEL_1;  // Se for, inicializa como NIVEL_1
        }
        int vidaBase = this.classe.getVidaPorNivel(); // Exemplo: Guerreiro tem 10, Mago tem 6
        int modificadorConstituicao = (this.getAtributo(Atributo.CONSTITUICAO) - 10) / 2;
        this.Vida = (vidaBase + modificadorConstituicao) * this.level.getNumero();// Vida total
        System.out.println("Vida calculada: " + this.Vida);
    }

    @Override
    public void maisXP(int xpGanho) {
        this.exp += xpGanho; // Adiciona XP ao total
        Level novoNivel = Level.getLevelPorXP(this.exp);
        if (!novoNivel.equals(this.level)) {
            this.level = novoNivel;
            calcularLevel(); // Atualiza o nível se houver mudança
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Raça: ").append(getRaca()).append("\n");
        sb.append("Classe: ").append(getClasse()).append("\n");
        sb.append("Level: ").append(getLevel()).append("\n");
        sb.append("Vida: ").append(getVida()).append("\n");
        sb.append("Atributos:\n");
        for (Atributo atributo : Atributo.values()) {
            sb.append(atributo).append(": ").append(getAtributo(atributo)).append("\n");
        }
        return sb.toString();
    }
}
