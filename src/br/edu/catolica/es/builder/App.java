package br.edu.catolica.es.builder;

public class App {


    public static void main(String[] args) {

        var pessoa1 = new PessoaBuilder("Hebert")
                .altura(1.82f)
                .cpf("000.111.222-33")
                .idade(21)
                .create();

        var pessoa2 = new PessoaBuilder("Nicole")
                .altura(1.69f)
                .rg("000.111.222")
                .idade(19)
                .create();

        System.out.println(pessoa1);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(pessoa2);
    }
}
