package de.simplycloud.gwt.client.notification.eventing.error;

import com.google.gwt.event.shared.EventHandler;

public interface NotificationErrorHandler extends EventHandler {

	void onError(NotificationErrorEvent event);
}
