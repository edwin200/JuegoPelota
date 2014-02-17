package com.mi.juegopelotaActors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mi.juegopelota.JuegoPelota;

public class BarraActor extends Actor {
    
	private TextureRegion Barra;
	public Vector2 velocidad = new Vector2(0,0);
	
	
	public BarraActor() {
		
		Barra = new TextureRegion(JuegoPelota.MANAGER.get("barra.png",Texture.class), 16 ,64);
		setSize(Barra.getRegionWidth(), Barra.getRegionHeight());
	}
	
	@Override
	public void act(float delta) {
		
		translate(velocidad.x * delta, velocidad.y * delta);
		
		if(getX()< 0){
			setX(0);
			velocidad.x=0;	
		}
		else if(getRight() > getStage().getWidth()) { 
			setX(getStage().getWidth() - getWidth());
			velocidad.x=0;
		}
		
		if(getY()< 0){
			setY(0);
			velocidad.y=0;	
		}
		else if(getTop() > getStage().getHeight()) { 
			setY(getStage().getHeight() - getHeight());
			velocidad.y=0;
		}
		
		
	}
	
	
	
	
	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		
		batch.draw(Barra, getX(), getY(), getOriginX(), getOriginY(),
				getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}

}
