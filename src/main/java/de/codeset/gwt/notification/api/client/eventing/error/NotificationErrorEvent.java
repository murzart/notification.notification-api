package de.codeset.gwt.notification.api.client.eventing.error;

import com.google.gwt.event.shared.GwtEvent;

import de.codeset.gwt.notification.api.client.Notification;

/**
 * @author Marcel Konopka
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public class NotificationErrorEvent extends GwtEvent<NotificationErrorHandler> {

	private static final Type<NotificationErrorHandler> TYPE = new Type<NotificationErrorHandler>();

	private Notification notification;

	public NotificationErrorEvent(Notification notification) {
		this.notification = notification;
	}

	public static Type<NotificationErrorHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationErrorHandler> getAssociatedType() {
		return TYPE;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	@Override
	protected void dispatch(NotificationErrorHandler handler) {
		handler.onError(this);
	}
}