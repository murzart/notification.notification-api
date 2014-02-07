package de.codeset.gwt.client.notification.eventing.error;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public interface HasNotificationErrorHandlers extends HasHandlers {

	HandlerRegistration addErrorHandler(NotificationErrorHandler handler);
}
