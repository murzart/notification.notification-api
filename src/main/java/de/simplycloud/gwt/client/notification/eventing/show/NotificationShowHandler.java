package de.simplycloud.gwt.client.notification.eventing.show;

import com.google.gwt.event.shared.EventHandler;

/**
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
