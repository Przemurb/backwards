package pl.javastart.fxevent.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class mainPaneController {

    @FXML
    private Button clearButton;

    @FXML
    private TextArea textArea1;

    @FXML
    private TextArea textArea2;


    public void initialize() {

        clearButton.setOnAction(click -> {
            textArea1.clear();
            textArea2.clear();
        });

        textArea1.addEventFilter(KeyEvent.KEY_RELEASED, event -> {
            textArea2.setText(new StringBuilder(textArea1.getText()).reverse().toString());
        });

        textArea2.addEventFilter(KeyEvent.KEY_RELEASED, event -> {
            StringBuilder stringBuilder = new StringBuilder();
            String reverse = stringBuilder.append(textArea2.getText()).reverse().toString();
            textArea1.setText(reverse);
        });
    }
}
