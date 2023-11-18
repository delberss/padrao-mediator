package org.example;

public class Cliente {

    public String fazerPedido(String pedido) {
        return Garcom.getInstancia().enviarPedidoCozinha(pedido);
    }

    public String reclamar(String reclamacao) {
        return Garcom.getInstancia().enviarReclamacaoCozinha(reclamacao);
    }

    public String elogiar(String elogio) {
        return Garcom.getInstancia().enviarElogioCozinha(elogio);
    }
}