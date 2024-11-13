package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Carro;

public class CarroController {

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtCor;

    @FXML
    private Button btnLigar;

    @FXML
    private Button btnAcelerar;

    @FXML
    private Button btnFreiar;

    @FXML
    private Label lblResultado;

    private Carro carro;

    @FXML
    public void initialize() {
        btnLigar.setOnAction(event -> {
            criarCarro();
            carro.ligar();
            lblResultado.setText("O carro " + carro.getModelo() + " está ligado!");
        });

        btnAcelerar.setOnAction(event -> {
            criarCarro();
            carro.acelerar();
            lblResultado.setText("O carro " + carro.getModelo() + " está acelerando!");
        });

        btnFreiar.setOnAction(event -> {
            criarCarro();
            carro.freiar();
            lblResultado.setText("O carro " + carro.getModelo() + " foi freiado.");
        });
    }

    @FXML
    private void ligar() {
        criarCarro();
        carro.ligar();
        lblResultado.setText("O carro " + carro.getModelo() + " está ligado!");
    }

    @FXML
    private void acelerar() {
        criarCarro();
        carro.acelerar();
        lblResultado.setText("O carro " + carro.getModelo() + " está acelerando!");
    }

    @FXML
    private void freiar() {
        criarCarro();
        carro.freiar();
        lblResultado.setText("O carro " + carro.getModelo() + " foi freiado.");
    }

    private void criarCarro() {
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String cor = txtCor.getText();
        carro = new Carro(modelo, marca, cor);
    }
}

