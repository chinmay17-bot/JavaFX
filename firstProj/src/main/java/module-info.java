module com.example.firstproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstproj to javafx.fxml;
    exports com.example.firstproj;
}