package me.xtrm.delta.api;

import me.xtrm.atlaspluginloader.api.event.IEventManager;
import me.xtrm.atlaspluginloader.core.APLProvider;
import me.xtrm.delta.api.command.ICommandManager;
import me.xtrm.delta.api.module.IModuleManager;
import me.xtrm.delta.api.setting.ISettingManager;

public class DeltaAPI {
	
	private static ICommandManager iCommandManager;
	private static IEventManager iEventManager;
	private static IModuleManager iModuleManager;
	private static ISettingManager iSettingManager;
	
	public static ICommandManager getCommandManager() {
		if(iCommandManager == null)
			throw new IllegalStateException("CommandManager is not loaded!");
		return iCommandManager;
	}
	
	public static void setCommandManager(ICommandManager iCommandManager) {
		DeltaAPI.iCommandManager = iCommandManager;
	}
	
	public static IEventManager getEventManager() {
		if(iEventManager == null)
			iEventManager = APLProvider.getPrimaryAPL().getEventManager();
		if(iEventManager == null)
			throw new IllegalStateException("EventManager is not loaded!");
		return iEventManager;
	}
	
	public static void setEventManager(IEventManager iEventManager) {
		DeltaAPI.iEventManager = iEventManager;
	}
	
	public static IModuleManager getModuleManager() {
		if(iModuleManager == null)
			throw new IllegalStateException("ModuleManager is not loaded!");
		return iModuleManager;
	}
	
	public static void setModuleManager(IModuleManager iModuleManager) {
		DeltaAPI.iModuleManager = iModuleManager;
	}
	
	public static ISettingManager getSettingManager() {
		if(iSettingManager == null)
			throw new IllegalStateException("SettingManager is not loaded!");
		return iSettingManager;
	}
	
	public static void setSettingManager(ISettingManager iSettingManager) {
		DeltaAPI.iSettingManager = iSettingManager;
	}

}
