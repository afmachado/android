package org.sagemath.droid.events;

/**
 * <p>The event received when the websockets disconnect</p>
 *
 * @author Nikhil Peter Raj
 */
public class ServerDisconnectEvent {
    private boolean isDisonnected;

    public ServerDisconnectEvent(boolean isDisonnected) {
        this.isDisonnected = isDisonnected;
    }

    public boolean isDisonnected() {
        return isDisonnected;
    }
}
