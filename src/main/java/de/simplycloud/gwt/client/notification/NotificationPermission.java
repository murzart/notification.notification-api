package de.simplycloud.gwt.client.notification;

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