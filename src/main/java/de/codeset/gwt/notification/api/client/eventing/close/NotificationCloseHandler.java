package de.codeset.gwt.notification.api.client.eventing.close;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
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