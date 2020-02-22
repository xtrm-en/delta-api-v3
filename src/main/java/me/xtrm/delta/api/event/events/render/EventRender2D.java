package me.xtrm.delta.api.event.events.render;

import me.xtrm.atlaspluginloader.core.event.Event;

public class EventRender2D extends Event {
	
	private float partialTicks;
	
	public EventRender2D(float partialTicks) {
		this.partialTicks = partialTicks;
	}
	
	public float getPartialTicks() {
		return this.partialTicks;
	}

}
