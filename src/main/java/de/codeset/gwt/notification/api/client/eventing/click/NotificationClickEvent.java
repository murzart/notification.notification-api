package de.codeset.gwt.notification.api.client.eventing.click;

import com.google.gwt.event.shared.GwtEvent;

import de.codeset.gwt.notification.api.client.Notification;

/**
 * @author Marcel Konopka
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public class NotificationClickEvent extends GwtEvent<NotificationClickHandler> {

	private static final Type<NotificationClickHandler> TYPE = new Type<NotificationClickHandler>();

	private Notification notification;

	public NotificationClickEvent(Notification notification) {
		this.notification = notification;
	}

	public static Type<NotificationClickHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationClickHandler> getAssociatedType() {
		return TYPE;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	@Override
	protected void dispatch(NotificationClickHandler handler) {
		handler.onClick(this);
	}
}