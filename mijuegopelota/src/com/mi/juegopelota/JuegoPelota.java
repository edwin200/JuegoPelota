package com.mi.juegopelota;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class JuegoPelota extends Game {
	
	
     public static final AssetManager MANAGER = new AssetManager();

	@Override
	public void create() {
		
		MANAGER.load("barra.png" , Texture.class);
		MANAGER.load("Flechaabajo.png" , Texture.class);
		MANAGER.load("Flechaarriba.png" , Texture.class);
		MANAGER.load("pelota.png" , Texture.class);
		
		while(!MANAGER.update()){
			//MOSTRAR PANTALLA DE CARGA
		}
				
	setScreen(new GameplayScreen(this));
		
	}
	
	@Override
	public void dispose(){
		super.dispose();
		MANAGER.dispose();
	}
	

}
