module lp.tarefa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens lp1.tarefa4 to javafx.fxml;
    opens lp1.tarefa4.controller to javafx.fxml;

    exports lp1.tarefa4;
    exports lp1.tarefa4.controller;
    exports lp1.tarefa4.model;
}