package PlatformerGame;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class Menu extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1280);
        settings.setHeight(720);
    }
    protected void initMainMenu(Pane mainMenuRoot) {
    Rectangle bg = new Rectangle(1280, 720);

    Font font = Font.font(72);
    Button btnStart = new Button("START");
    btnStart.setFont(font);
    btnStart.setOnAction(event -> startGame());

    Button btnExit = new Button("EXIT");
    btnExit.setFont(font);
    btnExit.setOnAction(event -> exit());

    VBox vbox = new VBox(50, btnStart, btnExit);
    vbox.setTranslateX(400);
    vbox.setTranslateY(200);

    mainMenuRoot.getChildren().addAll(bg, vbox);
    }
    private void exit() {
    }
    private void startGame() {
    }
}