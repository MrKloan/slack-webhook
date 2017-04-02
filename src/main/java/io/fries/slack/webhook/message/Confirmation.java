package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Confirmation {
	
	private String title;
	private String text;
	private String okText;
	private String dismissText;
}
