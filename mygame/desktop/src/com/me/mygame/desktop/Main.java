package com.me.mygame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;
import com.me.mygame.Drop;

public class Main {
	public static void main (String[] arg) {
		runPacker();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Drop(), config);
	}
	
	private static void runPacker() {
		Settings settings = new Settings();
//		settings.maxWidth = 512;
//		settings.maxHeight = 512;
		
		TexturePacker2.process(settings, "../images", "../android/assets", "game");
	}
}
