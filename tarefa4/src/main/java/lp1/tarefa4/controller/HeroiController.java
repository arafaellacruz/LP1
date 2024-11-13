package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Heroi;

public class HeroiController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPoder;

    @FXML
    private TextField txtPontosDeVida;

    @FXML
    private Button btnAtacar;

    @FXML
    private Button btnEspecial;

    @FXML
    private Button btnTreinar;

    @FXML
    private Label lblResultado;

    private Heroi heroi;

    @FXML
    public void initialize() {
        lblResultado.setText("Preencha os dados do herói e selecione uma ação.");
    }

    @FXML
    private void atacar() {
        if (validaCampos()) {
            heroi = new Heroi(txtNome.getText(), txtPoder.getText(), Integer.parseInt(txtPontosDeVida.getText()));
            heroi.atacar();
            lblResultado.setText("O herói " + heroi.getNome() + " está atacando!");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos.");
        }
    }

    @FXML
    private void usarHabilidadeEspecial() {
        if (heroi != null) {
            heroi.usarHabilidadeEspecial();
            lblResultado.setText("O herói " + heroi.getNome() + " está usando suas habilidades especiais!");
        } else {
            lblResultado.setText("Preencha os dados e ataque antes de usar a habilidade especial.");
        }
    }

    @FXML
    private void treinar() {
        if (heroi != null) {
            heroi.treinar();
            lblResultado.setText("O herói " + heroi.getNome() + " está treinando seu poder: " + heroi.getPoder() + ".");
        } else {
            lblResultado.setText("Preencha os dados e ataque antes de treinar.");
        }
    }

    private boolean validaCampos() {
        return !txtNome.getText().isEmpty() && !txtPoder.getText().isEmpty() && !txtPontosDeVida.getText().isEmpty();
    }
}
