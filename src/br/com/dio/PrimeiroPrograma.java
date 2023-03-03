package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro = new Livros("O pequeno principe", 300);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b) );*/
    }

}

    class Livros {
        private String nome;
        private Integer numPages;

        public Livros(String nome, Integer numPages) {
            this.nome = nome;
            this.numPages = numPages;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPages() {
            return numPages;
        }

        public void setNumPages(Integer numPages) {
            this.numPages = numPages;
        }

        @Override
        public String toString() {
            return "Livros{" +
                    "nome='" + nome + '\'' +
                    ", numPages=" + numPages +
                    '}';
        }
    }

