module com.example.components {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.components to javafx.fxml;
    exports com.example.components;
}