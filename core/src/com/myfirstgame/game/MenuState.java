package com.myfirstgame.game;

/**
 * Created by bobby_000 on 13/03/2016.
 */

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import java.awt.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;


import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener;

import com.badlogic.gdx.scenes.scene2d.utils.Drawable;


/**
 * Created by bobby_000 on 10/03/2016.
 */
public class MenuState implements Screen {

    private Stage stage;

    private Skin skin;
    private Table table;
    private TextButton singlePlayer,multiPlayer;
    MyGdxGame game;



    @Override
    public void show() {

        stage=new Stage();
        skin= new Skin(Gdx.files.internal("uiskin.json"));
        table=new Table();
        Gdx.input.setInputProcessor(stage);
        // Gdx.gl.glClearColor(1, 0, 0, 1);

        table.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


       //stage consume events

        singlePlayer=new TextButton("Singleplayer",skin);
        multiPlayer =new TextButton("Multiplayer",skin);

        singlePlayer.addListener(new ActorGestureListener() {
            @Override
            public void tap(InputEvent event, float x, float y, int count,
                            int button) {
                super.tap(event,x,y,count,button);
                Gdx.app.log("click", "performed");
            }
        });
       /* multiPlayer.addListener(new ClickListener(){

            public void clicked(InputEvent event,float x,float y){
               //game.setScreen((Screen) new Sample(game));
                stage.addAction(Actions.sequence(Actions.fadeOut(2), Actions.run(new Runnable() {
                    @Override
                    public void run() {
                        //next state
                        Gdx.app.log("click","performed");
                    }
                })));
            }
        });*/
        singlePlayer.center();
        multiPlayer.center();


        table.add(singlePlayer).width(Gdx.graphics.getWidth()/5).height(Gdx.graphics.getHeight()/7);
        table.row();
        table.getCell(singlePlayer).spaceBottom(40);
        table.add(multiPlayer).width(Gdx.graphics.getWidth()/5).height(Gdx.graphics.getHeight()/7);
        singlePlayer.getLabel().setScale(10);
        singlePlayer.getLabel().setWidth(500);
        //table.debug();
        stage.addActor(table);





    }
    @Override
    public void render(float delta) {
        // Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Math.min(Gdx.graphics.getDeltaTime(),1/30f));
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {

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
        skin.dispose();
        stage.dispose();

    }
}