package me.xtrm.delta.api.event.events.render;

import me.xtrm.atlaspluginloader.core.event.Event;

public class EventRender3D extends Event {
	
	private float partialTicks;
	
	public EventRender3D(float partialTicks) {
		this.partialTicks = partialTicks;
	}
	
	public float getPartialTicks() {
		return this.partialTicks;
	}

}
