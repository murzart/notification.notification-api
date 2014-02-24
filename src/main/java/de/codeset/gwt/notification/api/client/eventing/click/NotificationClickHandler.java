package de.codeset.gwt.notification.api.client.eventing.click;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public interface NotificationClickHandler extends EventHandler {

	void onClick(NotificationClickEvent event);
}
