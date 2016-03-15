package com.myfirstgame.game;

/**
 * Created by bobby_000 on 13/03/2016.
 */

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by bobby_000 on 10/03/2016.
 */
public class GameStateManager {

    private Stack<State> states;

    public GameStateManager()
    {
        states=new Stack<State>();
    }
    public void push(State state)
    {
        states.push(state);
    }
    public void pop()
    {
        states.pop();
    }
    public void set(State state)
    {
        states.pop();
        states.push(state);
    }
    public void update(float dt)
    {
        states.peek().update(dt);
    }
    public void render(SpriteBatch sb)
    {
        states.peek().render(sb);
    }


}
