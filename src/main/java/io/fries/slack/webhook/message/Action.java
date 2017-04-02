package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Action {
	
	enum Style { DEFAULT, PRIMARY, DANGER }
	
	private String name;
	private String text;
	
	private Style style;
	private String type;
	
	private String value;
	private Confirmation confirm;
}
