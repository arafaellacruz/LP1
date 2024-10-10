package lp1.tarefa3;

public class Inseto {
    private String nome;
    private String especie;
    private String cor;

    public Inseto(String nome, String especie, String cor) {
        this.nome = nome;
        this.especie = especie;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer() {
        System.out.println(nome+" está comendo.");
    }

    public void voar() {
        System.out.println(nome+" está voando.");
    }
    public void andar() {
        System.out.println(nome+" está andando pela floresta.");
    }
}
