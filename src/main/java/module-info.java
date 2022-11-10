module com.mycompany.lab5b {
    requires javafx.controls;
    requires java.logging;
    requires javafx.fxml;

    opens com.mycompany.lab5b to javafx.fxml;
    exports com.mycompany.lab5b;
}
