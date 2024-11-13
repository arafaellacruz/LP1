package lp1.tarefa4.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button btnCachorro;

    @FXML
    private Button btnCarro;

    @FXML
    private Button btnCelular;

    @FXML
    private Button btnGato;

    @FXML
    private Button btnHashira;

    @FXML
    private Button btnHeroi;

    @FXML
    private Button btnInseto;

    @FXML
    private Button btnNinja;

    @FXML
    private Button btnPato;

    @FXML
    private Button btnPessoa;

    @FXML
    private AnchorPane contentPane;

    @FXML
    public void initialize() {
        try {
            abrirCadastroCachorro();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void abrirCadastroCachorro() throws IOException {
        carregarView("CachorroView.fxml");
    }

    public void abrirCadastroCarro() throws IOException {
        carregarView("CarroView.fxml");
    }

    public void abrirCadastroCelular() throws IOException {
        carregarView("CelularView.fxml");
    }

    public void abrirCadastroGato() throws IOException {
        carregarView("GatoView.fxml");
    }

    public void abrirCadastroHashira() throws IOException {
        carregarView("HashiraView.fxml");
    }

    public void abrirCadastroHeroi() throws IOException {
        carregarView("HeroiView.fxml");
    }

    public void abrirCadastroInseto() throws IOException {
        carregarView("InsetoView.fxml");
    }

    public void abrirCadastroNinja() throws IOException {
        carregarView("NinjaView.fxml");
    }

    public void abrirCadastroPato() throws IOException {
        carregarView("PatoView.fxml");
    }

    public void abrirCadastroPessoa() throws IOException {
        carregarView("PessoaView.fxml");
    }

    private void carregarView(String viewName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/lp1/tarefa4/" + viewName));
        Node view = loader.load();

        contentPane.getChildren().setAll(view);
    }

}
