package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Gato;

public class GatoController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRaca;

    @FXML
    private TextField txtIdade;

    @FXML
    private Button btnMiar;

    @FXML
    private Button btnDerrubar;

    @FXML
    private Button btnDormir;

    @FXML
    private Label lblResultado;

    private Gato gato;

    @FXML
    public void initialize() {
        lblResultado.setText("Preencha os dados do gato e selecione uma ação.");
    }

    @FXML
    private void miar() {
        if (validaCampos()) {
            gato = new Gato(txtNome.getText(), txtRaca.getText(), Integer.parseInt(txtIdade.getText()));
            gato.miar();
            lblResultado.setText(gato.getNome() + " está miando: Miau miau miau...");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void derrubar() {
        if (gato != null) {
            gato.derrubarCoisas();
            lblResultado.setText(gato.getNome() + " derrubou alguma coisa!");
        } else {
            lblResultado.setText("Preencha os dados e faça o gato miar antes.");
        }
    }

    @FXML
    private void dormir() {
        if (gato != null) {
            gato.dormir();
            lblResultado.setText(gato.getNome() + " está dormindo... zzzzzzz.");
        } else {
            lblResultado.setText("Preencha os dados e faça o gato miar antes.");
        }
    }

    private boolean validaCampos() {
        return !txtNome.getText().isEmpty() && !txtRaca.getText().isEmpty() && !txtIdade.getText().isEmpty();
    }
}
