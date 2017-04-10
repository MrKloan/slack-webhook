package io.fries.slack.webhook.trigger;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	
	public String id;
	public String name;
}
