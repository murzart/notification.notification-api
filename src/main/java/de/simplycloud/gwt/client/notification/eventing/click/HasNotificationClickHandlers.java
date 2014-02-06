package de.simplycloud.gwt.client.notification.eventing.click;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;


public interface HasNotificationClickHandlers extends HasHandlers{

	  HandlerRegistration addClickHandler(NotificationClickHandler handler);
}
