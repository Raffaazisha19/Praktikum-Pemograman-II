module com.example.module06 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module06 to javafx.fxml;
    exports com.example.module06;
}