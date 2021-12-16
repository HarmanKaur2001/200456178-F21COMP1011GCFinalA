module com.example.f21comp1011gcfinala {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    requires java.net.http;



    opens com.example.f21comp1011gcfinala to javafx.fxml, com.google.gson ;
    exports com.example.f21comp1011gcfinala;
}