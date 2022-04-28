module com.example.testfx01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testfx01 to javafx.fxml;
    exports com.example.testfx01;
}