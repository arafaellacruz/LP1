package lp1.tarefa3;

public class Heroi {
    private String nome;
    private String poder;
    private int pontosDeVida;

    public Heroi(String nome, String poder, int pontosDeVida) {
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

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void atacar() {
        System.out.println(nome+" está atacando.");
    }

    public void usarHabilidadeEspecial() {
        System.out.println(nome+" está atacando com habilidades especiais.");
    }
    public void treinar() {
        System.out.println(nome+" está treinando: "+poder);
    }

}
