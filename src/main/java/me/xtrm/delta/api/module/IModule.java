package me.xtrm.delta.api.module;

import me.xtrm.delta.api.DeltaAPI;
import me.xtrm.delta.api.setting.ISetting;

public interface IModule {
	
	String getName();
	
	String getDisplayName();
	void setDisplayName(String displayName);
	
	String getDescription();
	void setDescription(String desc);
	
	Category getCategory();
	
	int getKey();
	void setKey(int key);
	
	int getAnim();
	void setAnim(int anim);
	
	boolean isEnabled();
	void setEnabled(boolean state);
	
	boolean isVisible();
	void setVisible(boolean visible);
	
	void toggle();
	
	void onEnable();
	void onToggle();
	void onDisable();
	
	default void addSetting(ISetting setting) {
		DeltaAPI.getSettingManager().addSetting(setting);
	}
	
	default ISetting getSetting(String name) {
		return DeltaAPI.getSettingManager().getSettingByInternalName(this, name);
	}

}
