module edu.agustana {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.agustana to javafx.fxml;
    exports edu.agustana;
}
