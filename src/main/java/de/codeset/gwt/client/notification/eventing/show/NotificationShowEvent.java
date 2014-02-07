package de.codeset.gwt.client.notification.eventing.show;

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public class NotificationShowEvent extends GwtEvent<NotificationShowHandler> {

	private static final Type<NotificationShowHandler> TYPE = new Type<NotificationShowHandler>();

	public static Type<NotificationShowHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationShowHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(NotificationShowHandler handler) {
		handler.onShow(this);
	}
}