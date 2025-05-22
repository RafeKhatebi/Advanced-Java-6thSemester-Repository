module com.example.lecture09 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lecture09 to javafx.fxml;
    exports com.example.lecture09;
}