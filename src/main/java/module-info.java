module com.example.demo {
    requires org.jsoup;
    requires java.sql;
    requires freetts;
    requires jlayer;
    requires com.codeborne.selenide;
    requires webdrivermanager;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}