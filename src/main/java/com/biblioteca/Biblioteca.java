package com.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    public final ArrayList<Livro> livros;
    public final ArrayList<Autor> autores;
    public final ArrayList<Editora> editoras;
    public final ArrayList<LivroEstoque> estoque;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
        autores = new ArrayList<Autor>();
        editoras = new ArrayList<Editora>();
        estoque = new ArrayList<LivroEstoque>();
    }

    public void AdicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void RemoverLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public void AdicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void RemoverAutor(Autor autor) {
        this.autores.remove(autor);
    }

    public void AdicionarEditora(Editora editora) {
        this.editoras.add(editora);
    }

    public void RemoverEditora(Editora editora) {
        this.editoras.remove(editora);
    }

    public void AdicionarEstoque(LivroEstoque livroEstoque) {
        this.estoque.add(livroEstoque);
    }

    public void RemoverEstoque(LivroEstoque livroEstoque) {
        this.estoque.remove(livroEstoque);
    }


}