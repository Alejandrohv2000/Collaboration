module com.example.collaboration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.collaboration to javafx.fxml;
    exports com.example.collaboration;
}