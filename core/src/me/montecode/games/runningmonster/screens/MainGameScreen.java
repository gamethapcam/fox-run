package me.montecode.games.runningmonster.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import me.montecode.games.runningmonster.RunningMonsterGame;
import me.montecode.games.runningmonster.helpers.AssetLoader;
import me.montecode.games.runningmonster.stages.GameStage;

public class MainGameScreen implements Screen {

    private GameStage stage;
    private SpriteBatch batcher;
    private BitmapFont font;

    public MainGameScreen(RunningMonsterGame game){
    	AssetLoader.load();
        stage = new GameStage(game);
    }

    @Override
    public void render(float delta) {
        //Clear the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //Update the stage
        stage.draw();
        stage.act(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
    	AssetLoader.dispose();
    }
}
