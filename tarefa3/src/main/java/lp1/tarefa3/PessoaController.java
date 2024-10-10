package lp1.tarefa3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PessoaController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtIdade;

    @FXML
    private Button btnComer;

    @FXML
    private Button btnTrabalhar;

    @FXML
    private Button btnEstudar;

    @FXML
    private Label lblResultado;

    private Pessoa pessoa;

    @FXML
    public void initialize() {
        lblResultado.setText("Preencha os dados da pessoa e selecione uma ação.");
    }

    @FXML
    private void comer() {
        if (validaCampos()) {
            pessoa = new Pessoa(txtNome.getText(), txtGenero.getText(), Integer.parseInt(txtIdade.getText()));
            pessoa.comer();
            lblResultado.setText(pessoa.getNome() + " está comendo.");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void trabalhar() {
        if (pessoa != null) {
            pessoa.trabalhar();
            lblResultado.setText(pessoa.getNome() + " está trabalhando.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Comer' antes de trabalhar.");
        }
    }

    @FXML
    private void estudar() {
        if (pessoa != null) {
            pessoa.estudar();
            lblResultado.setText(pessoa.getNome() + " está estudando.");
        } else {
            lblResultado.setText("Preencha os dados e clique em 'Comer' antes de estudar.");
        }
    }

    private boolean validaCampos() {
        return !txtNome.getText().isEmpty() && !txtGenero.getText().isEmpty() && !txtIdade.getText().isEmpty();
    }
}
