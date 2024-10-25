package Buttons;

import Homescreen.Homescreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Main;
import helper.Gameinfo;

public class MainMenuButtons {
    private Main game;
    private Stage stage;
    private Viewport viewport;

    private ImageButton playButton;
    private ImageButton exitButton;

    public MainMenuButtons(Main game) {
        this.game = game;
        viewport = new FitViewport(Gameinfo.width, Gameinfo.height, new OrthographicCamera());
        stage = new Stage(viewport, game.getBatch());

        createAndPositionButtons();
        stage.addActor(playButton);
        stage.addActor(exitButton);
        Gdx.input.setInputProcessor(stage);
    }

    private void createAndPositionButtons() {
        Skin buttonSkin = new Skin(Gdx.files.internal("ui/uiskin.json"));

        playButton = new ImageButton(buttonSkin);
        playButton.setSize(200, 100); // Set button size for consistency
        playButton.setPosition(Gameinfo.width / 2f - playButton.getWidth() / 2, Gameinfo.height / 2f + 50);

        exitButton = new ImageButton(buttonSkin);
        exitButton.setSize(200, 100); // Set button size for consistency
        exitButton.setPosition(Gameinfo.width / 2f - exitButton.getWidth() / 2, Gameinfo.height / 2f - 50);

        addListenerToButtons();
    }

    private void addListenerToButtons() {
        playButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new Homescreen(game));
            }
        });

        exitButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });
    }

    public Stage getStage() {
        return this.stage;
    }
}
