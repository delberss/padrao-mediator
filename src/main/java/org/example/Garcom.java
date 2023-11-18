package org.example;

public class Garcom {

    private static Garcom instancia = new Garcom();

    private Garcom() {}

    public static Garcom getInstancia() {
        return instancia;
    }

    public String enviarPedidoCozinha(String pedido) {
        return "Garçom enviou pedido à cozinha.\n" +
                ">> " + Cozinha.getInstancia().receberPedido(pedido);
    }

    public String enviarReclamacaoCozinha(String reclamacao) {
        return "Garçom enviou reclamação à cozinha.\n" +
                ">> " + Cozinha.getInstancia().receberReclamacao(reclamacao);
    }

    public String enviarElogioCozinha(String elogio) {
        return "Garçom enviou elogio à cozinha.\n" +
                ">> " + Cozinha.getInstancia().receberElogio(elogio);
    }
}