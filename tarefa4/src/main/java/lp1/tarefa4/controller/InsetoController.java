package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Inseto;

public class InsetoController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtCor;

    @FXML
    private Button btnComer;

    @FXML
    private Button btnVoar;

    @FXML
    private Button btnAndar;

    @FXML
    private Label lblResultado;

    private Inseto inseto;

    @FXML
    public void initialize() {
        lblResultado.setText("Preencha os dados do inseto e selecione uma ação.");
    }

    @FXML
    private void comer() {
        if (validaCampos()) {
            inseto = new Inseto(txtNome.getText(), txtEspecie.getText(), txtCor.getText());
            inseto.comer();
            lblResultado.setText("O inseto " + inseto.getNome() + " está comendo.");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void voar() {
        if (inseto != null) {
            inseto.voar();
            lblResultado.setText("O inseto " + inseto.getNome() + " está voando.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Comer' antes de voar.");
        }
    }

    @FXML
    private void andar() {
        if (inseto != null) {
            inseto.andar();
            lblResultado.setText("O inseto " + inseto.getNome() + " está andando pela floresta.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Comer' antes de andar.");
        }
    }

    private boolean validaCampos() {
        return !txtNome.getText().isEmpty() && !txtEspecie.getText().isEmpty() && !txtCor.getText().isEmpty();
    }
}
