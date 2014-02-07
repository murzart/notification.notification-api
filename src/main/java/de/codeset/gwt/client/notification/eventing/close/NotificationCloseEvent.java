package de.codeset.gwt.client.notification.eventing.close;

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
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