package com.mi.juegopelota;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL11;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mi.juegopelotaActors.BarraActor;
import com.mi.juegopelotaActors.PelotaActor;

public class GameplayScreen extends AbstractScreen {
	
	
	private BarraActor Barra;
	private PelotaActor Pelota;
	private Stage stage;
	float x;
	float y;
	
	public GameplayScreen(JuegoPelota game) {
		super(game);
		
	}
	

	@Override
	public void show() {
		
		x =500;
		y=100;
		stage = new Stage();
		Barra = new BarraActor();
		Pelota = new PelotaActor();
	    Gdx.input.setInputProcessor(stage);
		
	    Pelota.setPosition(x,y);
		Barra.setPosition(10,10);
		stage.setKeyboardFocus(Barra);
		Barra.addListener(new InputListener(){
			
			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				switch(keycode) {
				
				case Input.Keys.UP:
					Barra.velocidad.y = 250;
					return true;
					
				case Input.Keys.DOWN:
					Barra.velocidad.y = -250;
					return true;
					default:
						return false;							
				}
			}
						
			@Override
			public boolean keyUp(InputEvent event, int keycode) {
                switch(keycode) {
				
				case Input.Keys.UP:	
				case Input.Keys.DOWN:
					Barra.velocidad.y = 0;
					return true;
					default:
						return false;							
				}	
			}
		   
			
		});
		
		stage.addActor(Pelota);
	    stage.addActor(Barra);
	    
	
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL11.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();
     
	}

	@Override
	public void hide() {
	

	}

	@Override
	public void dispose() {
		stage.dispose();

	}
	
	@Override
	public void resize(int width, int height) {
		stage.setViewport(width, height, true);
	}

}
