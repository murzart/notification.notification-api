package de.codeset.gwt.notification.api.client.eventing.close;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 * A widget that implements this interface provides registration for
 * {@link NotificationCloseHandler} instances.
 */
public interface HasNotificationCloseHandlers extends HasHandlers{
	  /**
	   * Adds a {@link NotificationCloseEvent} handler.
	   * 
	   * @param handler the close handler
	   * @return {@link HandlerRegistration} used to remove this handler
	   */
	  HandlerRegistration addCloseHandler(NotificationCloseHandler handler);
}
