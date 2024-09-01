package classes;

public class Ninja {
    private String nome;
    private String aldeia;
    private String jutso;

    public Ninja(String nome, String aldeia, String jutso) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.jutso = jutso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public String getJutso() {
        return jutso;
    }

    public void setJutso(String jutso) {
        this.jutso = jutso;
    }

    public void atacar() {
        System.out.println(nome+" está atacando.");
    }

    public void esconder() {
        System.out.println(nome+" está se escondendo do inimigo.");
    }
    public void jogarShuriken() {
        System.out.println(nome+" está jogando shurikens.");
    }

}
