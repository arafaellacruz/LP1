package lp1.tarefa4.model;

import java.time.LocalTime;

public class Cachorro {
    private String nome;
    private String raca;
    private String cor;

    public Cachorro(String nome, String raca, String cor) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void brincar() {
       System.out.println(nome + " está muito feliz brincando com seu brinquedo favorito!");
   }

    public void correr() {
        System.out.println(nome + " está correndo pelo parque!");
    }

    public void dormir() {
        LocalTime agora = LocalTime.now();
        LocalTime limit = LocalTime.of(22, 0);

        if (agora.isAfter(limit)) {
            System.out.println(nome + " está pronto para brincar!");
        } else {
            System.out.println("zzzzzzz.... Ops! " + nome + ": está muito cansado, está dormindo e não pode brincar agora! Volte novamente mais tarde ("); // Antes das 22h
        }
    }
}
