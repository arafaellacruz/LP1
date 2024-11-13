package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Hashira;

public class HashiraController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRespiracao;

    @FXML
    private TextField txtCorEspada;

    @FXML
    private Button btnAtacar;

    @FXML
    private Button btnDefender;

    @FXML
    private Button btnCurar;

    @FXML
    private Label lblResultado;

    private Hashira hashira;

    @FXML
    public void initialize() {
        lblResultado.setText("Preencha os dados do Hashira e selecione uma ação.");
    }

    @FXML
    private void atacar() {
        if (validaCampos()) {
            hashira = new Hashira(txtNome.getText(), txtRespiracao.getText(), txtCorEspada.getText());
            hashira.atacar();
            lblResultado.setText("O Hashira " + hashira.getNome() + " usou o ataque da respiração " + hashira.getRespiracao() + "!");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void defender() {
        if (hashira != null) {
            hashira.defender();
            lblResultado.setText("O Hashira " + hashira.getNome() + " defendeu o ataque!");
        } else {
            lblResultado.setText("Preencha os dados e ataque antes de defender.");
        }
    }

    @FXML
    private void curar() {
        if (hashira != null) {
            hashira.curar();
            lblResultado.setText("O Hashira " + hashira.getNome() + " está se curando.");
        } else {
            lblResultado.setText("Preencha os dados e ataque antes de curar.");
        }
    }

    private boolean validaCampos() {
        return !txtNome.getText().isEmpty() && !txtRespiracao.getText().isEmpty() && !txtCorEspada.getText().isEmpty();
    }
}
