package com.myfirstgame.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.swing.plaf.nimbus.*;

/**
 * Created by bobby_000 on 15/03/2016.
 */
public class Sample extends State  {
    private Texture settings;
    private MyGdxGame game;

    public Sample(MyGdxGame game)
    {
        this.game= game;
        settings=new Texture("Singleplayer1.png");
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
