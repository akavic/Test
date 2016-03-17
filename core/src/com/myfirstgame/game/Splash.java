package com.myfirstgame.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.AddAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FillViewport;


public class Splash implements Screen{

    private static final float WORLD_WIDTH =224; // size of the image (aspect ratio for the image)
    private static final float WORLD_HEIGHT = 224;
    private Image background;
    private FillViewport viewport;
    private Texture splashTexture;
    private Stage stage;
   //private Game game;

    /*public Splash(Game game)
    {
        this.game=game;
    }*/

    @Override
    public void show() {

        viewport = new FillViewport(WORLD_WIDTH,WORLD_HEIGHT);
        stage=new Stage();
        splashTexture =new Texture("splashSprite.png");
        stage.setViewport(viewport);
        background =new Image( splashTexture);
        stage.addActor(background);

        stage.addAction(Actions.sequence(Actions.fadeOut(5), Actions.run(new Runnable() {
            @Override
            public void run() {
              // game.setScreen(new StartScreen(game));
            }
        })));






    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        stage.act(delta);
        stage.draw();


    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

        splashTexture.dispose();
        stage.dispose();


    }
}

