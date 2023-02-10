module com.mycompany.ejercicioled {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.ejercicioled to javafx.fxml;
    exports com.mycompany.ejercicioled;
}
