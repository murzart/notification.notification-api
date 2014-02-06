package de.simplycloud.gwt.client.notification.eventing.error;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public interface HasNotificationErrorHandlers extends HasHandlers {

	HandlerRegistration addErrorHandler(NotificationErrorHandler handler);
}
