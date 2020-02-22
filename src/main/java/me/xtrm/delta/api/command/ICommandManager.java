package me.xtrm.delta.api.command;

import java.util.List;

public interface ICommandManager {
	
	void registerCommands();
	List<ICommand> getCommands();
	
	void runCommand(ICommandListener panel, String message);

}
