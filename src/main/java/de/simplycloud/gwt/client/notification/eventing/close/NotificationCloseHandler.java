package de.simplycloud.gwt.client.notification.eventing.close;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler for {@link NotificationCloseEvent} events.
 */
public interface NotificationCloseHandler extends EventHandler {

	/**
	 * Called when a native close event is fired.
	 * 
	 * @param event
	 *            the {@link NotificationCloseEvent} that was fired
	 */
	void onClose(NotificationCloseEvent event);

}