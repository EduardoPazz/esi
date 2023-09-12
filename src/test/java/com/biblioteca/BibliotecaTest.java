package com.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void testAdicionarLivro() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro();

        // Act

        biblioteca.AdicionarLivro(livro);

        // Assert

        assertEquals(1, biblioteca.livros.size());
    }

    @Test
    public void testRemoverLivro() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro();
        biblioteca.AdicionarLivro(livro);

        // Act

        biblioteca.RemoverLivro(livro);

        // Assert

        assertEquals(0, biblioteca.livros.size());
    }

    @Test
    public void testAdicionarAutor() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor();

        // Act

        biblioteca.AdicionarAutor(autor);

        // Assert

        assertEquals(1, biblioteca.autores.size());
    }

    @Test
    public void testRemoverAutor() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor();
        biblioteca.AdicionarAutor(autor);

        // Act

        biblioteca.RemoverAutor(autor);

        // Assert

        assertEquals(0, biblioteca.autores.size());
    }

    @Test
    public void testAdicionarEditora() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        Editora editora = new Editora();

        // Act

        biblioteca.AdicionarEditora(editora);

        // Assert

        assertEquals(1, biblioteca.editoras.size());
    }

    @Test
    public void testRemoverEditora() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        Editora editora = new Editora();
        biblioteca.AdicionarEditora(editora);

        // Act

        biblioteca.RemoverEditora(editora);

        // Assert

        assertEquals(0, biblioteca.editoras.size());
    }

    @Test
    public void testAdicionarEstoque() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        LivroEstoque livroEstoque = new LivroEstoque();

        // Act

        biblioteca.AdicionarEstoque(livroEstoque);

        // Assert

        assertEquals(1, biblioteca.estoque.size());
    }

    @Test
    public void testRemoverEstoque() {
        // Arrange

        Biblioteca biblioteca = new Biblioteca();
        LivroEstoque livroEstoque = new LivroEstoque();
        biblioteca.AdicionarEstoque(livroEstoque);

        // Act

        biblioteca.RemoverEstoque(livroEstoque);

        // Assert

        assertEquals(0, biblioteca.estoque.size());
    }
}
