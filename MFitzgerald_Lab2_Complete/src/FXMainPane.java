


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

    private Button button1, button2, button3, button4, button5;
    private Label label;
    private TextField textField;

    private HBox hBox1, hBox2;

    private DataManager dataManager;

    FXMainPane() {
        button1 = new Button("Hello");
        button2 = new Button("Howdy");
        button3 = new Button("Chinese");
        button4 = new Button("Clear");
        button5 = new Button("Exit");

        label = new Label("Label:");
        textField = new TextField();

        hBox1 = new HBox(10);
        hBox2 = new HBox(10);

        dataManager = new DataManager();

        HBox.setMargin(label, new Insets(5));
        HBox.setMargin(textField, new Insets(5));
        HBox.setMargin(button1, new Insets(5));
        HBox.setMargin(button2, new Insets(5));
        HBox.setMargin(button3, new Insets(5));
        HBox.setMargin(button4, new Insets(5));
        HBox.setMargin(button5, new Insets(5));

        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);

        hBox1.getChildren().addAll(label, textField);
        hBox2.getChildren().addAll(button1, button2, button3, button4, button5);
        getChildren().addAll(hBox1, hBox2);

        HBox.setMargin(label, new Insets(5));
        HBox.setMargin(textField, new Insets(5));
        HBox.setMargin(button1, new Insets(5));
        HBox.setMargin(button2, new Insets(5));
        HBox.setMargin(button3, new Insets(5));
        HBox.setMargin(button4, new Insets(5));
        HBox.setMargin(button5, new Insets(5));

        button1.setOnAction(new ButtonHandler());
        button2.setOnAction(new ButtonHandler());
        button3.setOnAction(new ButtonHandler());
        button4.setOnAction(new ButtonHandler());
        button5.setOnAction(new ButtonHandler());
    }

    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Button clickedButton = (Button) event.getSource();

            if (clickedButton == button1) {
                textField.setText(dataManager.getHello());
            } else if (clickedButton == button2) {
                textField.setText(dataManager.getHowdy());
            } else if (clickedButton == button3) {
                textField.setText(dataManager.getChinese());
            } else if (clickedButton == button4) {
                textField.setText("");
            } else if (clickedButton == button5) {
                Platform.exit();
                System.exit(0);
            }
        }
    }
}
	
