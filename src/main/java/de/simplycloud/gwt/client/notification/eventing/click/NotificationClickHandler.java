package de.simplycloud.gwt.client.notification.eventing.click;

import com.google.gwt.event.shared.EventHandler;

public interface NotificationClickHandler extends EventHandler {

	void onClick(NotificationClickEvent event);
}
