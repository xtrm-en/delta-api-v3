package me.xtrm.delta.api.event.events.move;

import me.xtrm.atlaspluginloader.core.event.Cancellable;
import me.xtrm.atlaspluginloader.core.event.Event;

@Cancellable
public class EventMotion extends Event {

	private State state;
	
	private double x, y, z;
	private float yaw, pitch;
	private boolean onGround;
	
	private boolean silent;
	
	public EventMotion(State state, double x, double y, double z, float yaw, float pitch, boolean onGround) {
		this.state = state;
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
		this.onGround = onGround;
		this.silent = true;
	}
	
	public boolean isSilent() {
		return silent;
	}
	
	public void setSilent(boolean silent) {
		this.silent = silent;
	}
	
	public State getType() {
		return state;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public boolean isOnGround() {
		return onGround;
	}

	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}

}
