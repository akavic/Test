package com.myfirstgame.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.swing.plaf.nimbus.*;
// irrelevant just used to test transitioning
/**
 * Created by bobby_000 on 15/03/2016.
 */
public class PlayState extends State {
    private Texture settings;

    public PlayState(GameStateManager gsm)
    {
        super(gsm);
        settings=new Texture("Setting.png");
    }
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(settings,50,50);
        sb.end();
    }



    @Override
    public void dispose() {

    }
}
