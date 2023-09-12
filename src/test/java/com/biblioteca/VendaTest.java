package com.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class VendaTest {

    // Test empty constructor
    @Test
    public void testEmptyConstructor() {
        // Act

        Venda venda = new Venda();

        // Assert

        assertNull(venda.nomeCliente);
        assertNull(venda.formaPagamento);
        assertNull(venda.livros);
        assertEquals(0, venda.valorDado, 0.0);
    }

    @Test
    public void testConstructor() {
        // Arrange

        String nomeCliente = "João";
        String formaPagamento = "Dinheiro";
        double valorDado = 100;
        List<LivroVenda> livros = new ArrayList<LivroVenda>();

        // Act

        Venda venda = new Venda(nomeCliente, formaPagamento, valorDado, livros);

        // Assert

        assertEquals(venda.nomeCliente, nomeCliente);
        assertEquals(venda.formaPagamento, formaPagamento);
        assertEquals(venda.livros, livros);
        assertEquals(venda.valorDado, valorDado, 0.0);
    }
}
