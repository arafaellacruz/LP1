package lp1.tarefa4.model;

public class Pato {
    private String nome;
    private String cor;
    private String acessorio;

    public Pato(String nome, String cor, String acessorio) {
        this.nome = nome;
        this.cor = cor;
        this.acessorio = acessorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public void nadar() {
        System.out.println(nome+" está nadando.");
    }

    public void voar() {
        System.out.println(nome+" está voando.");
    }
    public void correr() {
        System.out.println(nome+" está correndo.");
    }
}
