package de.codeset.gwt.notification.api.client.eventing.error;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * @author Marcel Konopka
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public interface HasNotificationErrorHandlers extends HasHandlers {

	HandlerRegistration addErrorHandler(NotificationErrorHandler handler);
}
