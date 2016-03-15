package com.myfirstgame.game;

/**
 * Created by bobby_000 on 13/03/2016.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Input.Keys;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.sun.javafx.scene.control.skin.MenuButtonSkin;

import java.awt.Rectangle;

import javafx.scene.control.Skin;


/**
 * Created by bobby_000 on 10/03/2016.
 */
public class MenuState extends State {


  ;

    private Texture background;
    private Texture singlePlayer;
    private Texture Multiplayer;
    OrthographicCamera camera;



    public MenuState(GameStateManager gsm) {
        super(gsm);

        background=new Texture("wood.jpg");
        singlePlayer=new Texture(Gdx.files.internal("Singleplayer1.png"));
        Multiplayer =new Texture(Gdx.files.internal("Multiplayer1.png"));
       // camera.setToOrtho(true,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());



    }


    @Override
    protected void handleInput() {
        if(Gdx.input.isTouched())
        {
            Vector3 tmp= new Vector3(Gdx.input.getX(),Gdx.input.getY(),0);
            camera.unproject(tmp);
            Rectangle singleBtn= new Rectangle((Gdx.graphics.getWidth()/4)-(singlePlayer.getWidth()/2),(Gdx.graphics.getHeight()/2)-(singlePlayer.getHeight()/2),singlePlayer.getWidth(),singlePlayer.getHeight());
            Rectangle multiBtn= new Rectangle((Gdx.graphics.getWidth()/2)-(Multiplayer.getWidth()/2),(Gdx.graphics.getHeight()/2)-(Multiplayer.getHeight()/2),Multiplayer.getWidth(),Multiplayer.getHeight());

            if(singleBtn.contains(tmp.x,tmp.y))
            {
                gsm.push(new PlayState(gsm)); // sat you want to be active
            }
            else if(multiBtn.contains(tmp.x,tmp.y)){
                gsm.push(new Sample(gsm));
            }
        }
    }



    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
    // draw background

        sb.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        sb.draw(singlePlayer,(Gdx.graphics.getWidth()/4)-(singlePlayer.getWidth()/2),(Gdx.graphics.getHeight()/2)-(singlePlayer.getHeight()/2),singlePlayer.getWidth(),singlePlayer.getHeight());
        sb.draw(Multiplayer,(Gdx.graphics.getWidth()/2)-(Multiplayer.getWidth()/2),(Gdx.graphics.getHeight()/2)-(Multiplayer.getHeight()/2),singlePlayer.getWidth(),Multiplayer.getHeight());



        sb.end();

    }



    @Override
    public void dispose() {
        background.dispose();
        singlePlayer.dispose();
        Multiplayer.dispose();
    }
}