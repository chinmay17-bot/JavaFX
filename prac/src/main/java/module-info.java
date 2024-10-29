module com.example.prac {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prac to javafx.fxml;
    exports com.example.prac;
}