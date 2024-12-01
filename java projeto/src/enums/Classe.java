package enums;

public enum Classe {
    Barbaro(12),
    Bardo(8),
    Clerigo(8),
    Druida(8),
    Guerreiro(10),
    Monje(8),
    Paladino(10),
    Patrulheiro(10),
    Ladino(8),
    Feiticeiro(6),
    Bruxo(8),
    Mago(6);


    private final int vidaPorNivel;

    Classe(int vidaPorNivel) {
        this.vidaPorNivel = vidaPorNivel;
    }

    public int getVidaPorNivel() {
        return vidaPorNivel;
    }
}
