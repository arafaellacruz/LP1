package lp1.tarefa4.model;

public class Celular {
    private String modelo;
    private String marca;
    private String cor;

    public Celular(String modelo, String marca, String cor) {
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
        System.out.println("O celular está sendo inicializado...");
    }

    public void tirarFoto() {
        System.out.println("CLIC! Foto salva em sua galeria!");
    }

    public void acessarInstagram() {
        System.out.println("Abrindo Instagram...");
    }
}
