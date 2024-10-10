package lp1.tarefa3;

public class Hashira {
    private String nome;
    private String respiracao;
    private String corEspada;

    private String[] defesas = {"bloqueeou", "esquivou", "contra-atacou", "usou defesa especial "};
    private int i;

    public Hashira(String nome, String respiracao, String corEspada) {
        this.nome = nome;
        this.respiracao = respiracao;
        this.corEspada = corEspada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRespiracao() {
        return respiracao;
    }

    public void setRespiracao(String respiracao) {
        this.respiracao = respiracao;
    }

    public String getCorEspada() {
        return corEspada;
    }

    public void setCorEspada(String corEspada) {
        this.corEspada = corEspada;
    }

    public void atacar() {
        System.out.println("O Hashira "+nome+" usou seu ataque "+respiracao);
    }

    public void defender() {
        System.out.println(nome+" "+defesas[i]+" seu ataque.");
        i++;

        if(i >= defesas.length) {
            i = 0;
        }
    }

    public void curar() {
        System.out.println(nome+" está se curando.");
    }


}
