module com.example.communicationbtwncontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.communicationbtwncontroller to javafx.fxml;
    exports com.example.communicationbtwncontroller;
}