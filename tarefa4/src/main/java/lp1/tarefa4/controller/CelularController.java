package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Celular;

public class CelularController {

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtCor;

    @FXML
    private Button btnLigar;

    @FXML
    private Button btnTirarFoto;

    @FXML
    private Button btnInstagram;

    @FXML
    private Label lblResultado;

    private Celular celular;

    @FXML
    private void ligar() {
        if (validaCampos()) {
            celular = new Celular(txtModelo.getText(), txtMarca.getText(), txtCor.getText());
            celular.ligar();
            lblResultado.setText("O celular " + celular.getMarca() + " " + celular.getModelo() + " foi ligado.");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void tirarFoto() {
        if (celular != null) {
            celular.tirarFoto();
            lblResultado.setText("Você tirou uma foto com o celular " + celular.getMarca() + " " + celular.getModelo() + ".");
        } else {
            lblResultado.setText("Primeiro ligue o celular para tirar uma foto.");
        }
    }

    @FXML
    private void acessarInstagram() {
        if (celular != null) {
            celular.acessarInstagram();
            lblResultado.setText("Abrindo Instagram no celular " + celular.getMarca() + " " + celular.getModelo() + ".");
        } else {
            lblResultado.setText("Primeiro ligue o celular para acessar o Instagram.");
        }
    }

    private boolean validaCampos() {
        return !txtMarca.getText().isEmpty() && !txtModelo.getText().isEmpty() && !txtCor.getText().isEmpty();
    }
}
