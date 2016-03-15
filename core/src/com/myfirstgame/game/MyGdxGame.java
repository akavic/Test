package com.myfirstgame.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Color;

import static java.awt.Color.RED;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
    private GameStateManager gsm;


    private OrthographicCamera camera;



	@Override
	public void create () {
		batch = new SpriteBatch();
        gsm=new GameStateManager();
        Gdx.gl.glClearColor(1, 0, 0, 1); // use the clear color of (1 0 0 1 1)1= on 0=off
        gsm.push(new MenuState(gsm)); // draws main menu

	}
    public void dispose(){



    }

	@Override
	public void render () {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //gdx.gl

		//batch.begin();
        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.render(batch);

		//font.draw(batch, "hello world", 200,200);
		//batch.end();
	}


}
