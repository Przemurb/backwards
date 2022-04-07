module fxevents {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports pl.javastart.fxevent.main to javafx.graphics;
    opens pl.javastart.fxevent.controllers to javafx.fxml;
}