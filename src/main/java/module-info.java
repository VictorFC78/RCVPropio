module com.mycompany.javafxpractica {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxpractica to javafx.fxml;
    exports com.mycompany.javafxpractica;
}
