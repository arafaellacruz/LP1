package lp1.tarefa3;

public class Gato {
    private String nome;
    private String raca;
    private int idade;

    private final String[] coisasParaDerrubar = {"seu vaso.", "seus livros.", "seu video-game", "suas flores.", "seu tabuleiro de xadrez."};
    private int i = 0;

    public Gato(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void miar() {
        System.out.println("Miau miau miau...");
    }

    public void derrubarCoisas() {
        System.out.println("Ops... Parece que "+nome+" derrubou "+coisasParaDerrubar[i]);
        i++;

        if(i >= coisasParaDerrubar.length) {
            i = 0;
        }
    }

    public void dormir() {
        System.out.println("zzzzzzzz... Parece que "+nome+" está dormindo...");
    }
}
