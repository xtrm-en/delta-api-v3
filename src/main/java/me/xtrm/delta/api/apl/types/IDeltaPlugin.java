package me.xtrm.delta.api.apl.types;

import me.xtrm.atlaspluginloader.api.types.IPlugin;

public interface IDeltaPlugin extends IPlugin {

	void onPreInit();
	void onPostInit();
	
}