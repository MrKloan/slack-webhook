package io.fries.slack.webhook.trigger;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Channel {
	
	public String id;
	public String name;
}
