package de.codeset.gwt.notification.api.client.eventing.error;

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
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