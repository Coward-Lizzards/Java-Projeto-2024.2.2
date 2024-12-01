package enums;

public enum Level {
    NIVEL_1(1, 0),
    NIVEL_2(2, 300),
    NIVEL_3(3, 900),
    NIVEL_4(4, 2700),
    NIVEL_5(5, 6500),
    NIVEL_6(6, 14000),
    NIVEL_7(7, 23000),
    NIVEL_8(8, 34000),
    NIVEL_9(9, 48000),
    NIVEL_10(10, 64000),
    NIVEL_11(11, 85000),
    NIVEL_12(12, 100000),
    NIVEL_13(13, 120000),
    NIVEL_14(14, 140000),
    NIVEL_15(15, 165000),
    NIVEL_16(16, 195000),
    NIVEL_17(17, 225000),
    NIVEL_18(18, 265000),
    NIVEL_19(19, 305000),
    NIVEL_20(20, 355000);

    private final int numero;
    private final int xpMinimo;

    Level(int numero, int xpMinimo) {
        this.numero = numero;
        this.xpMinimo = xpMinimo;
    }

    public int getNumero() {
        return numero;
    }

    public int getXpMinimo() {
        return xpMinimo;
    }

    public static Level getLevelPorNumero(int numero) {
        for (Level level : Level.values()) {
            if (level.getNumero() == numero) {
                return level;
            }
        }
        throw new IllegalArgumentException("Nível inválido: " + numero); // Lança exceção se o número for inválido
    }

    // Retorna o nível baseado no XP atual
    public static Level getLevelPorXP(int xpAtual) {
        Level nivelAtual = NIVEL_1;
        for (Level nivel : values()) {
            if (xpAtual >= nivel.getXpMinimo()) {
                nivelAtual = nivel;
            } else {
                break;
            }
        }
        return nivelAtual;
    }

}