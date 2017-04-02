package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Action {
	
	enum Style { DEFAULT, PRIMARY, DANGER }
	
	private final String name;
	private final String text;
	
	private final Style style;
	private final String type;
	
	private final String value;
	private final Confirmation confirm;
}
