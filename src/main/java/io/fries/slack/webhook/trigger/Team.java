package io.fries.slack.webhook.trigger;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Team {
	
	public String id;
	public String domain;
}
