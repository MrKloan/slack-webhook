package io.fries.slack.webhook.trigger;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Trigger {
	
	private final String token;
	private final String teamId;
	private final String teamDomain;
	
	private final String channelId;
	private final String channelName;
	
	private final String userId;
	private final String userName;
	
	private final String command;
	private final String triggerWord;
	private final String text;
	
	private final String responseUrl;
}
