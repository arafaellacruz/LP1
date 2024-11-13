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
            criarCachorro();
            cachorro.brincar();
            lblResultado.setText(cachorro.getNome() + " está muito feliz brincando com seu brinquedo favorito!");
        });

        btnCorrer.setOnAction(event -> {
            criarCachorro();
            cachorro.correr();
            lblResultado.setText(cachorro.getNome() + " está pronto para brincar!");
        });

        btnDormir.setOnAction(event -> {
            criarCachorro();
            cachorro.dormir();
            lblResultado.setText("zzzzzzz.... Ops!  " + cachorro.getNome() + " está dormindo!");
        });
    }

    @FXML
    private void brincar() {
        criarCachorro();
        cachorro.brincar();
        lblResultado.setText(cachorro.getNome() + " está muito feliz brincando com seu brinquedo favorito!");
    }

    @FXML
    private void correr() {
        criarCachorro();
        cachorro.correr();
        lblResultado.setText(cachorro.getNome() + " está pronto para brincar!");
    }

    @FXML
    private void dormir() {
        criarCachorro();
        cachorro.dormir();
        lblResultado.setText("zzzzzzz.... Ops!  " + cachorro.getNome() + " está dormindo!");
    }

    private void criarCachorro() {
        String nome = txtNome.getText();
        String raca = txtRaca.getText();
        String cor = txtCor.getText();
        cachorro = new Cachorro(nome, raca, cor);
    }
}