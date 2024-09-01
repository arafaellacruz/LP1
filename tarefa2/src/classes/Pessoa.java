package classes;

public class Pessoa {
    private String nome;
    private String genero;
    private int idade;

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void comer() {
        System.out.println(nome+" está comendo.");
    }

    public void trabalhar() {
        System.out.println(nome+" está trabalhando.");
    }
    public void estudar() {
        System.out.println(nome+" está estudando.");
    }
    
}
