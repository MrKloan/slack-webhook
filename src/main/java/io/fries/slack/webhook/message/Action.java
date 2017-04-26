package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Action {
	
	public enum Style {
		DEFAULT, PRIMARY, DANGER;

		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	}
	
	private String name;
	private String text;
	
	private Style style;
	private String type;
	
	private String value;
	private Confirmation confirm;
}
