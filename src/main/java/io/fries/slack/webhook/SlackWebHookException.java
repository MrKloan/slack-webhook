package io.fries.slack.webhook;

public class SlackWebHookException extends RuntimeException {
	
	public SlackWebHookException(String message) {
		super(message);
	}
	
	public SlackWebHookException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
