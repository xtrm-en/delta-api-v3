package me.xtrm.delta.api.module;

import java.util.List;
import java.util.stream.Collectors;

public interface IModuleManager {
	
	void registerModules();
	List<IModule> getModules();
	
	default void addModule(IModule mod) {
		getModules().add(mod);
	}
	
	default IModule getModule(String name) {
		return getModules().stream().filter(m -> m.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
	
	default List<IModule> getModulesInCategory(Category cat){
		return getModules().stream().filter(m -> m.getCategory() == cat).collect(Collectors.toList());
	}

}
