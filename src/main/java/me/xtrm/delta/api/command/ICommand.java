package me.xtrm.delta.api.command;

import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;

public interface ICommand {

	Minecraft mc = Minecraft.getMinecraft();
	
	public abstract String getName();
	
	public abstract boolean execute(ICommandListener listener, String[] args);
	
	public abstract String getDescription();
	public abstract String[] getAliases();
	public abstract String getHelp();
	
	default void printMessage(ICommandListener listener, String msg) { 
		listener.print(EnumChatFormatting.GRAY + msg); 
	}
	
}
