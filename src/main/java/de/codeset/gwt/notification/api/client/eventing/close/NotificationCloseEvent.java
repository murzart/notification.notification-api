package de.codeset.gwt.notification.api.client.eventing.close;

import com.google.gwt.event.shared.GwtEvent;

import de.codeset.gwt.notification.api.client.Notification;

/**
 * @author Marcel Konopka
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public class NotificationCloseEvent extends GwtEvent<NotificationCloseHandler> {

	private static final Type<NotificationCloseHandler> TYPE = new Type<NotificationCloseHandler>();

	private Notification notification;

	public NotificationCloseEvent(Notification notification) {
		this.notification = notification;
	}

	public static Type<NotificationCloseHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationCloseHandler> getAssociatedType() {
		return TYPE;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	@Override
	protected void dispatch(NotificationCloseHandler handler) {
		handler.onClose(this);
	}
}