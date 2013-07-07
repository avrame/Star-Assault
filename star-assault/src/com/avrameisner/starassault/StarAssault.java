package com.avrameisner.starassault;

import com.avrameisner.starassault.screens.GameScreen;
import com.badlogic.gdx.Game;

public class StarAssault extends Game {
	
	@Override
	public void create() {		
		setScreen(new GameScreen());
	}
}
