package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Confirmation {
	
	private final String title;
	private final String text;
	private final String okText;
	private final String dismissText;
}
