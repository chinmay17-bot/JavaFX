module com.example.withscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.withscenebuilder to javafx.fxml;
    exports com.example.withscenebuilder;
}