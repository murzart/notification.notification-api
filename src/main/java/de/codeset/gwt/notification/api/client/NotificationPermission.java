package de.codeset.gwt.notification.api.client;

/**
 * @author Marcel Konopka 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public enum NotificationPermission {
	GRANTED, DENIED, DEFAULT;

	public static NotificationPermission fromString(String permission) {
		try {
			return NotificationPermission.valueOf(permission.toUpperCase());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return DEFAULT;
		}
	}
}