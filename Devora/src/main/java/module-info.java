module com.vita {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;
    requires java.management;
    requires java.mail;
    requires java.prefs;
    requires jdk.jsobject;
    requires jdk.httpserver;
    requires java.desktop;

    opens com.vita to javafx.fxml;
    opens com.vita.Controlleurs to javafx.fxml;
    opens com.vita.Entities to javafx.base, javafx.fxml;
    exports com.vita;
}
