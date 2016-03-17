package com.myfirstgame.game;

/**
 * Created by bobby_000 on 13/03/2016.
 */

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by bobby_000 on 10/03/2016.
 */
public abstract class State  {

    protected OrthographicCamera cam;
    GameStateManager gsm;

    protected State(){
        this.gsm=gsm;
        cam=new OrthographicCamera();

    }


    protected abstract void handleInput();
    public abstract  void update(float dt);
    public abstract void render(SpriteBatch sb);

    public abstract void dispose();


}
