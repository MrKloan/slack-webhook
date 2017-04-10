package io.fries.slack.webhook.trigger;

import io.fries.slack.webhook.message.Action;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ActionPayload {
	
	public List<Action> actions;
	public String callbackId;
	
	public Team team;
	public Channel channel;
	public User user;
	
	public String actionTs;
	public String messageTs;
	
	public String attachmentId;
	public String token;
	public Boolean isAppUnfurl;
	public String responseUrl;
}
