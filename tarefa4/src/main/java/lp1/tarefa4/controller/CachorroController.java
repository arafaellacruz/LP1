package lp1.tarefa4.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import lp1.tarefa4.dao.CachorroDAO;
import lp1.tarefa4.model.Cachorro;

import java.util.List;

public class CachorroController {

    @FXML
    private Button btnBrincar;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnCorrer;

    @FXML
    private Button btnDormir;

    @FXML
    private TableColumn<Cachorro, String> colNome;

    @FXML
    private TableColumn<Cachorro, String> colRaca;

    @FXML
    private TableColumn<Cachorro, String> colCor;

    @FXML
    private TableColumn<Cachorro, Void> colDelete;

    @FXML
    private Label lblResultado;

    @FXML
    private TableView<Cachorro> tableViewCachorros;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRaca;

    private CachorroDAO cachorroDAO = new CachorroDAO();

    @FXML
    private void initialize() {
        // configura as colunas
        colNome.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNome()));
        colRaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRaca()));
        colCor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCor()));

        // configura as colunas pra poder editar
        colNome.setCellFactory(TextFieldTableCell.forTableColumn());
        colRaca.setCellFactory(TextFieldTableCell.forTableColumn());
        colCor.setCellFactory(TextFieldTableCell.forTableColumn());

        // listener para atualizar o cachorro
        colNome.setOnEditCommit(event -> atualizarCachorro(event, "nome"));
        colRaca.setOnEditCommit(event -> atualizarCachorro(event, "raca"));
        colCor.setOnEditCommit(event -> atualizarCachorro(event, "cor"));

        // botao de excluir
        colDelete.setCellFactory(param -> new TableCell<>() {
            private final Button btnRemover = new Button("X");

            {
                btnRemover.setStyle("-fx-background-color: #14213D; -fx-text-fill: white;");
                btnRemover.setOnAction(event -> {
                    Cachorro cachorro = getTableView().getItems().get(getIndex());
                    deleteCachorro(cachorro);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(btnRemover);
                }
            }
        });

        carregarCachorros();
        tableViewCachorros.setEditable(true);
    }

    private void atualizarCachorro(TableColumn.CellEditEvent<Cachorro, String> event, String campo) {
        Cachorro cachorroEditado = event.getRowValue();
        String novoValor = event.getNewValue();

        switch (campo) {
            case "nome" -> cachorroEditado.setNome(novoValor);
            case "raca" -> cachorroEditado.setRaca(novoValor);
            case "cor" -> cachorroEditado.setCor(novoValor);
        }

        boolean sucesso = cachorroDAO.update(cachorroEditado);

        if (sucesso) {
            showAlert("Sucesso", "Cachorro atualizado com sucesso!", Alert.AlertType.INFORMATION);
        } else {
            showAlert("Erro", "Erro ao atualizar o cachorro no banco de dados.", Alert.AlertType.ERROR);
            tableViewCachorros.refresh();
        }
    }


    public void carregarCachorros() {
        List<Cachorro> cachorros = cachorroDAO.getCachorros();
        tableViewCachorros.getItems().clear();
        tableViewCachorros.getItems().addAll(cachorros);
    }


    @FXML
    public void cadastrar(ActionEvent event) {
        String nome = txtNome.getText();
        String raca = txtRaca.getText();
        String cor = txtCor.getText();

        if (nome.isEmpty() || raca.isEmpty() || cor.isEmpty()) {
            showAlert("Atenção", "Por favor, preencha todos os campos.", Alert.AlertType.WARNING);
            return;
        }

        Cachorro novoCachorro = new Cachorro(0, nome, raca, cor); // ID 0 temporário
        int idGerado = cachorroDAO.cadastrar(novoCachorro);

        if (idGerado != -1) {
            novoCachorro.setId(idGerado); // Atualiza com o ID gerado
            tableViewCachorros.getItems().add(novoCachorro);
            showAlert("Sucesso", "Cachorro cadastrado com sucesso!", Alert.AlertType.INFORMATION);
        } else {
            showAlert("Erro", "Erro ao cadastrar o cachorro.", Alert.AlertType.ERROR);
        }

        limparCampos();
    }

    private void deleteCachorro(Cachorro cachorro) {
        if (cachorroDAO.delete(cachorro.getId())) {
            tableViewCachorros.getItems().remove(cachorro);
            showAlert("Sucesso", "Cachorro excluído com sucesso.", Alert.AlertType.INFORMATION);
        } else {
            showAlert("Erro", "Não foi possível excluir o cachorro.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void brincar() {
        Cachorro selecionado = tableViewCachorros.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            lblResultado.setText(selecionado.getNome() + " está muito feliz brincando com seu brinquedo favorito!");
        } else {
            lblResultado.setText("Por favor, selecione um cachorro na tabela!");
        }
    }

    @FXML
    private void correr() {
        Cachorro selecionado = tableViewCachorros.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            lblResultado.setText(selecionado.getNome() + " está correndo alegremente!");
        } else {
            lblResultado.setText("Por favor, selecione um cachorro na tabela!");
        }
    }

    @FXML
    private void dormir() {
        Cachorro selecionado = tableViewCachorros.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            lblResultado.setText("zzzzzzz.... Ops! " + selecionado.getNome() + " está dormindo!");
        } else {
            lblResultado.setText("Por favor, selecione um cachorro na tabela!");
        }
    }

    private void limparCampos() {
        txtNome.clear();
        txtRaca.clear();
        txtCor.clear();
    }

    private void showAlert(String title, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
