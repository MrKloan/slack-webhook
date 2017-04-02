package io.fries.slack.webhook.trigger;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Trigger {
	
	private String token;
	private String teamId;
	private String teamDomain;
	
	private String channelId;
	private String channelName;
	
	private String userId;
	private String userName;
	
	private String command;
	private String triggerWord;
	private String text;
	
	private String responseUrl;
}
