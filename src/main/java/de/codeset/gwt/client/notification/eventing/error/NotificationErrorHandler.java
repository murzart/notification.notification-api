package de.codeset.gwt.client.notification.eventing.error;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public interface NotificationErrorHandler extends EventHandler {

	void onError(NotificationErrorEvent event);
}
