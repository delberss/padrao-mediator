package org.example;

public class Cozinha implements Setor {

    private static Cozinha instancia = new Cozinha();

    private Cozinha() {}

    public static Cozinha getInstancia() {
        return instancia;
    }

    public String receberPedido(String pedido) {
        return "Cozinha recebendo pedido: " + pedido;
    }

    public String receberReclamacao(String reclamacao) {
        return "Cozinha recebeu reclamação: " + reclamacao;
    }

    public String receberElogio(String elogio) {
        return "Cozinha agradece o elogio: " + elogio;
    }
}