package de.simplycloud.gwt.client.notification.eventing.close;

import com.google.gwt.event.shared.GwtEvent;

public class NotificationCloseEvent extends GwtEvent<NotificationCloseHandler> {

	private static final Type<NotificationCloseHandler> TYPE = new Type<NotificationCloseHandler>();

	public static Type<NotificationCloseHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationCloseHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(NotificationCloseHandler handler) {
		handler.onClose(this);
	}
}