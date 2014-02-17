package com.mi.juegopelotaActors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mi.juegopelota.JuegoPelota;

public class PelotaActor extends Actor {
     
	private TextureRegion Pelota;
	
	
	
	
	
	public PelotaActor() {
		
	
		
		Pelota = new TextureRegion(JuegoPelota.MANAGER.get("pelota.png",Texture.class),32 ,32);
		setSize(Pelota.getRegionWidth(), Pelota.getRegionHeight());
	}
	
	
	
	
	






	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		
		batch.draw(Pelota, getX(), getY(), getOriginX(), getOriginY(),
				getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}
	
	}

