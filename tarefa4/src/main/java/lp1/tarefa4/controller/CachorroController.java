package lp1.tarefa4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lp1.tarefa4.model.Cachorro;

public class CachorroController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRaca;

    @FXML
    private TextField txtCor;

    @FXML
    private Button btnBrincar;

    @FXML
    private Button btnCorrer;

    @FXML
    private Button btnDormir;

    @FXML
    private Label lblResultado;

    private Cachorro cachorro;

    @FXML
    public void initialize() {
        btnBrincar.setOnAction(event -> {
            if (cachorro != null) {
                cachorro.brincar();
                lblResultado.setText(cachorro.getNome() + " está muito feliz brincando com seu brinquedo favorito!");
            } else {
                lblResultado.setText("Por favor, crie um cachorro primeiro!");
            }
        });

        btnCorrer.setOnAction(event -> {
            if (cachorro != null) {
                cachorro.correr();
                lblResultado.setText(cachorro.getNome() + " está pronto para brincar!");
            } else {
                lblResultado.setText("Por favor, crie um cachorro primeiro!");
            }
        });

        btnDormir.setOnAction(event -> {
            if (cachorro != null) {
                cachorro.dormir();
                lblResultado.setText("zzzzzzz.... Ops! " + cachorro.getNome() + " está dormindo!");
            } else {
                lblResultado.setText("Por favor, crie um cachorro primeiro!");
            }
        });
    }

    @FXML
    private void criarCachorro() {
        String nome = txtNome.getText();
        String raca = txtRaca.getText();
        String cor = txtCor.getText();

        if (!nome.isEmpty() && !raca.isEmpty() && !cor.isEmpty()) {
            cachorro = new Cachorro(nome, raca, cor);
            lblResultado.setText("Cachorro " + cachorro.getNome() + " criado com sucesso!");
        } else {
            lblResultado.setText("Por favor, preencha todos os campos!");
        }
    }
}
