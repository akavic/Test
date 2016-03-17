package com.myfirstgame.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Color;

import static java.awt.Color.RED;

public class MyGdxGame extends Game {

    //private Game game;

   /* MyGdxGame(){
        game=this;
    }*/

	@Override
	public void create () {
        setScreen(new StartScreen());


	}
    public void dispose(){
        super.render();

    }

	@Override
	public void render () {
        super.render();



	}


}
