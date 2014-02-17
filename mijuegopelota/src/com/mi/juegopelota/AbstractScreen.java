package com.mi.juegopelota;

import com.badlogic.gdx.Screen;

public abstract class AbstractScreen implements Screen {
	
	protected JuegoPelota game;

	public AbstractScreen(JuegoPelota game) {
		this.game = game;
		
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



}
