module di.carta {
    requires javafx.controls;
    requires javafx.fxml;


    opens di.carta to javafx.fxml;
    exports di.carta;
}