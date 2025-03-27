package sobrecarga;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo; //Character

    //Sobrecarga de construtores
    public Pessoa() {
        System.out.println("Padrao...");
    }
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome; //o this sempre vem antes de qualquer coisa nesses casos, pois se trata de um construtor chamando outro construtor
        this.idade = idade;
        this.sexo = sexo;
        System.out.println("String, int, char");
    }

    public Pessoa(String nome, int idade) {
        this(nome, idade, '\0');
        System.out.println("String, int");
        // this.nome = nome;
        // this.idade = idade;
    }

    public Pessoa(int idade, String nome) {
        this(nome, idade); //chama o construtor acima
        System.out.println("int, String");
        // this.idade = idade;
        // this.nome = nome;
    }

    public Pessoa(String nome) {
        this(nome, 0);
        System.out.println("String");
    }

    public Pessoa(int idade) {
        this(idade, null);
        System.out.println("int");
    }

}