package com.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LivroVendaTest {
    @Test
    public void testIncrementarQuantidadeByOne() {
        // Arrange

        LivroVenda livroVenda = mockLivroVenda();

        // Act

        livroVenda.IncrementarQuantidade();

        // Assert

        assertEquals(11, livroVenda.quantidade);
    }

    @Test
    public void testIncrementarQuantidadeByTwo() {
        // Arrange

        LivroVenda livroVenda = mockLivroVenda();

        // Act

        livroVenda.IncrementarQuantidade(2);

        // Assert

        assertEquals(12, livroVenda.quantidade);
    }

    @Test
    public void testDecrementarQuantidadeByOne() {
        // Arrange

        LivroVenda livroVenda = mockLivroVenda();

        // Act

        livroVenda.DecrementarQuantidade();

        // Assert

        assertEquals(9, livroVenda.quantidade);
    }

    @Test
    public void testDecrementarQuantidadeByTwo() {
        // Arrange

        LivroVenda livroVenda = mockLivroVenda();

        // Act

        livroVenda.DecrementarQuantidade(2);

        // Assert

        assertEquals(8, livroVenda.quantidade);
    }

    @Test
    public void testDecrementarQuantidadeByTwoWhenQuantityIsOne() {
        // Arrange

        LivroVenda livroVenda = mockLivroVenda();
        livroVenda.quantidade = 1;

        // Act

        boolean result = livroVenda.DecrementarQuantidade(2);

        // Assert

        assertEquals(1, livroVenda.quantidade);
        assertFalse(result);
    }

    private static LivroVenda mockLivroVenda() {
        Autor autor = new Autor("Silas", "Bovolin");
        Editora editora = new Editora("Abril");
        Livro livro = new Livro(autor, editora, "isbn", "Como ficar rico com Javascript mental", 10);
        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 42.0);
        return new LivroVenda(livroEstoque, 10);
    }
}
