package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Ninja;

public class NinjaController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtAldeia;

    @FXML
    private TextField txtJutso;

    @FXML
    private Button btnAtacar;

    @FXML
    private Button btnEsconder;

    @FXML
    private Button btnShuriken;

    @FXML
    private Label lblResultado;

    private Ninja ninja;

    @FXML
    public void initialize() {
        lblResultado.setText("Preencha os dados do ninja e selecione uma ação.");
    }

    @FXML
    private void atacar() {
        if (validaCampos()) {
            ninja = new Ninja(txtNome.getText(), txtAldeia.getText(), txtJutso.getText());
            ninja.atacar();
            lblResultado.setText("O ninja " + ninja.getNome() + " está atacando com o jutso " + ninja.getJutso() + ".");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void esconder() {
        if (ninja != null) {
            ninja.esconder();
            lblResultado.setText("O ninja " + ninja.getNome() + " está se escondendo.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Atacar' antes de se esconder.");
        }
    }

    @FXML
    private void jogarShuriken() {
        if (ninja != null) {
            ninja.jogarShuriken();
            lblResultado.setText("O ninja " + ninja.getNome() + " está jogando shurikens.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Atacar' antes de jogar shurikens.");
        }
    }

    private boolean validaCampos() {
        return !txtNome.getText().isEmpty() && !txtAldeia.getText().isEmpty() && !txtJutso.getText().isEmpty();
    }
}
