package de.codeset.gwt.notification.api.client.eventing.show;

import com.google.gwt.event.shared.GwtEvent;

import de.codeset.gwt.notification.api.client.Notification;

/**
 * @author Marcel Konopka
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public class NotificationShowEvent extends GwtEvent<NotificationShowHandler> {

	private static final Type<NotificationShowHandler> TYPE = new Type<NotificationShowHandler>();

	private Notification notification;

	public NotificationShowEvent(Notification notification) {
		this.notification = notification;
	}

	public static Type<NotificationShowHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationShowHandler> getAssociatedType() {
		return TYPE;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	@Override
	protected void dispatch(NotificationShowHandler handler) {
		handler.onShow(this);
	}
}