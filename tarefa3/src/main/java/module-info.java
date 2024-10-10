module lp1.tarefa3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lp1.tarefa3 to javafx.fxml;
    exports lp1.tarefa3;
}