package de.codeset.gwt.notification.api.client.eventing.show;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 * Handler for {@link NotificationShowEvent} events.
 */
public interface NotificationShowHandler extends EventHandler {

	/**
	 * Called when a native show event is fired.
	 * 
	 * @param event
	 *            the {@link NotificationShowEvent} that was fired
	 */
	void onShow(NotificationShowEvent event);

}
