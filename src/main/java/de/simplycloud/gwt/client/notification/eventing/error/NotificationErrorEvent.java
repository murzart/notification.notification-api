package de.simplycloud.gwt.client.notification.eventing.error;

import com.google.gwt.event.shared.GwtEvent;

public class NotificationErrorEvent extends GwtEvent<NotificationErrorHandler> {

	private static final Type<NotificationErrorHandler> TYPE = new Type<NotificationErrorHandler>();

	public static Type<NotificationErrorHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationErrorHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(NotificationErrorHandler handler) {
		handler.onError(this);
	}
}