package com.mi.juegopelota;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "mijuegopelota";
		cfg.useGL20 = false;
		cfg.width = 640;
		cfg.height = 360;
		
		new LwjglApplication(new JuegoPelota(), cfg);
	}
}
