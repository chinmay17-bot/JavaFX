module com.example.exitbutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exitbutton to javafx.fxml;
    exports com.example.exitbutton;
}