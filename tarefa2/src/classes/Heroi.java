package classes;

public class Heroi {
    private String nome;
    private int poder;
    private int pontosDeVida;

    public Heroi(String nome, int poder, int pontosDeVida, String fraseDeEfeito) {
        this.nome = nome;
        this.poder = poder;
        this.pontosDeVida = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void atacar() {
        System.out.println(nome+" está comendo.");
    }

    public void trabalhar() {
        System.out.println(nome+" está trabalhando.");
    }
    public void estudar() {
        System.out.println(nome+" está estudando.");
    }

}
