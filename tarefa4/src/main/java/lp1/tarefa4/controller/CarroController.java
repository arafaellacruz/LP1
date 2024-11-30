package lp1.tarefa4.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import lp1.tarefa4.model.Carro;
import lp1.tarefa4.dao.CarroDAO;

import java.util.ArrayList;
import java.util.List;

public class CarroController {

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtCor;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnLigar;

    @FXML
    private Button btnAcelerar;

    @FXML
    private Button btnFreiar;

    @FXML
    private Label lblResultado;

    @FXML
    private TableView<Carro> tableViewCarros;

    @FXML
    private TableColumn<Carro, String> colModelo;

    @FXML
    private TableColumn<Carro, String> colMarca;

    @FXML
    private TableColumn<Carro, String> colCor;

    @FXML
    private TableColumn<Carro, Void> colDelete;

    private List<Carro> carros = new ArrayList<>();
    private CarroDAO carroDAO = new CarroDAO();

    @FXML
    public void initialize() {
        colModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        colMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        colCor.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCor()));

        colModelo.setCellFactory(TextFieldTableCell.forTableColumn());
        colMarca.setCellFactory(TextFieldTableCell.forTableColumn());
        colCor.setCellFactory(TextFieldTableCell.forTableColumn());

        colModelo.setOnEditCommit(event -> atualizarCarro(event, "modelo"));
        colMarca.setOnEditCommit(event -> atualizarCarro(event, "marca"));
        colCor.setOnEditCommit(event -> atualizarCarro(event, "cor"));

        colDelete.setCellFactory(param -> new TableCell<>() {
            private final Button btnRemover = new Button("X");

            {
                btnRemover.setStyle("-fx-background-color: #14213D; -fx-text-fill: white;");
                btnRemover.setOnAction(event -> {
                    Carro carro = getTableView().getItems().get(getIndex());
                    carroDAO.delete(carro); // Deleta do banco de dados
                    carros.remove(carro);
                    tableViewCarros.getItems().remove(carro);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : btnRemover);
            }
        });

        tableViewCarros.setEditable(true);

        carregarCarros();
    }

    @FXML
    private void cadastrar() {
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String cor = txtCor.getText();

        if (modelo.isEmpty() || marca.isEmpty() || cor.isEmpty()) {
            showAlert("Atenção", "Por favor, preencha todos os campos.", Alert.AlertType.WARNING);
            return;
        }

        Carro carroExistente = carroDAO.getCarroPorModeloMarcaCor(modelo, marca, cor);
        if (carroExistente != null) {
            showAlert("Atenção", "Este carro já está cadastrado.", Alert.AlertType.WARNING);
            return;
        }

        Carro novoCarro = new Carro(modelo, marca, cor);

        carroDAO.cadastrar(novoCarro);

        carros.add(novoCarro);
        tableViewCarros.getItems().add(novoCarro);

        showAlert("Sucesso", "Carro cadastrado com sucesso!", Alert.AlertType.INFORMATION);
        limparCampos();
    }


    private void atualizarCarro(TableColumn.CellEditEvent<Carro, String> event, String campo) {
        Carro carroEditado = event.getRowValue();
        String novoValor = event.getNewValue();

        switch (campo) {
            case "modelo" -> {
                carroEditado.setModelo(novoValor);
                carroDAO.update(carroEditado);
            }
            case "marca" -> {
                carroEditado.setMarca(novoValor);
                carroDAO.update(carroEditado);
            }
            case "cor" -> {
                carroEditado.setCor(novoValor);
                carroDAO.update(carroEditado);
            }
        }

        tableViewCarros.refresh();
    }

    @FXML
    private void dirigir() {
        Carro selecionado = tableViewCarros.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            lblResultado.setText("O carro " + selecionado.getModelo() + " está dirigindo!");
        } else {
            lblResultado.setText("Por favor, selecione um carro na tabela!");
        }
    }


    @FXML
    private void ligar() {
        Carro selecionado = tableViewCarros.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            lblResultado.setText("O carro " + selecionado.getModelo() + " está ligado!");
        } else {
            lblResultado.setText("Por favor, selecione um carro na tabela!");
        }
    }

    @FXML
    private void acelerar() {
        Carro selecionado = tableViewCarros.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            lblResultado.setText("O carro " + selecionado.getModelo() + " está acelerando!");
        } else {
            lblResultado.setText("Por favor, selecione um carro na tabela!");
        }
    }

    @FXML
    private void freiar() {
        Carro selecionado = tableViewCarros.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            lblResultado.setText("O carro " + selecionado.getModelo() + " foi freiado.");
        } else {
            lblResultado.setText("Por favor, selecione um carro na tabela!");
        }
    }

    private void limparCampos() {
        txtModelo.clear();
        txtMarca.clear();
        txtCor.clear();
    }

    private void showAlert(String title, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void carregarCarros() {
        List<Carro> carrosDoBanco = carroDAO.getCarros();
        tableViewCarros.getItems().clear();
        tableViewCarros.getItems().addAll(carrosDoBanco);
    }


}
