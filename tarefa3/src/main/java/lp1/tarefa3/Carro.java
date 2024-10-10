package lp1.tarefa3;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;

    public Carro(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar() {
        System.out.println("Carro Ligado");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void freiar() {
        System.out.println("O carro foi freiado.");
    }

}
