package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveFazerPedido() {
        Cliente cliente = new Cliente();
        assertEquals("Garçom enviou pedido à cozinha.\n" +
                        ">> Cozinha recebendo pedido: Pizza",
                cliente.fazerPedido("Pizza"));
    }

    @Test
    void deveReclamar() {
        Cliente cliente = new Cliente();
        assertEquals("Garçom enviou reclamação à cozinha.\n" +
                        ">> Cozinha recebeu reclamação: Pedido atrasado",
                cliente.reclamar("Pedido atrasado"));
    }

    @Test
    void deveElogiar() {
        Cliente cliente = new Cliente();
        assertEquals("Garçom enviou elogio à cozinha.\n" +
                        ">> Cozinha agradece o elogio: Excelente sabor",
                cliente.elogiar("Excelente sabor"));
    }
}