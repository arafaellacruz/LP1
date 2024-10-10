package lp1.tarefa3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PatoController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtAcessorio;

    @FXML
    private Button btnNadar;

    @FXML
    private Button btnVoar;

    @FXML
    private Button btnCorrer;

    @FXML
    private Label lblResultado;

    private Pato pato;

    @FXML
    public void initialize() {
        lblResultado.setText("Preencha os dados do pato e selecione uma ação.");
    }

    @FXML
    private void nadar() {
        if (validaCampos()) {
            pato = new Pato(txtNome.getText(), txtCor.getText(), txtAcessorio.getText());
            pato.nadar();
            lblResultado.setText("O pato " + pato.getNome() + " está nadando.");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void voar() {
        if (pato != null) {
            pato.voar();
            lblResultado.setText("O pato " + pato.getNome() + " está voando.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Nadar' antes de voar.");
        }
    }

    @FXML
    private void correr() {
        if (pato != null) {
            pato.correr();
            lblResultado.setText("O pato " + pato.getNome() + " está correndo.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Nadar' antes de correr.");
        }
    }

    private boolean validaCampos() {
        return !txtNome.getText().isEmpty() && !txtCor.getText().isEmpty() && !txtAcessorio.getText().isEmpty();
    }
}
