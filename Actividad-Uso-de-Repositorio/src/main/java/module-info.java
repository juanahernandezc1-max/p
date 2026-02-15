module com.example.actividad1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.actividad1 to javafx.fxml;
    exports com.example.actividad1;
}