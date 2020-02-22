package me.xtrm.delta.api.event.events.network;

import me.xtrm.atlaspluginloader.core.event.Cancellable;
import me.xtrm.atlaspluginloader.core.event.Event;
import net.minecraft.network.Packet;

@Cancellable
public class EventPacket extends Event {

	private final Packet packet;
	private final State state;
	
	public EventPacket(Packet packet, State state) {	
		if(state != State.RECEIVE && state != State.SEND)
			throw new IllegalArgumentException("EventType must either be RECEIVE or SEND");
		
		this.state = state;
		this.packet = packet;
	}
	
	public Packet getPacket() {
		return packet; 
	}
	
	public State getState() {
		return state;
	}

}
