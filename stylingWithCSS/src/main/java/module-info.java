module com.example.stylingwithcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stylingwithcss to javafx.fxml;
    exports com.example.stylingwithcss;
}