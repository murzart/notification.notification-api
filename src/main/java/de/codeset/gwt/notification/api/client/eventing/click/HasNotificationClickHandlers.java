package de.codeset.gwt.notification.api.client.eventing.click;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public interface HasNotificationClickHandlers extends HasHandlers{

	  HandlerRegistration addClickHandler(NotificationClickHandler handler);
}
