package model;

import enums.Atributo;

public interface MetodosUP {
    // Calcula o level baseado na experiência ou outros critérios
    void calcularLevel();

    // Calcula a vida baseada em atributos, level e raça
    void calcularVida();

    // Adiciona experiência ao personagem
    void maisXP(int xpGanho);

    // Incrementa um atributo específico
    void incrementarAtributo(Atributo atributo, int incremento);

    // Retorna o valor atual de um atributo
    int getAtributo(Atributo atributo);

    // Define o valor de um atributo específico
    void setAtributo(Atributo atributo, int valor);

    // Exibe os detalhes do personagem
    void Detalhes();
}