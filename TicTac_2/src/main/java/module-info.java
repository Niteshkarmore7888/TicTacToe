module com.example.tictac_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictac_2 to javafx.fxml;
    exports com.example.tictac_2;
}