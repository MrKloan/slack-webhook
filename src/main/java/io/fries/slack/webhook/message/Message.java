package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Message {
	
	public enum ResponseType { IN_CHANNEL, EPHEMERAL }
	
	private String username;
	private String iconEmoji;
	private String channel;
	
	private String text;
	private Boolean mrkdwn;
	
	private List<Attachment> attachments;
	
	private ResponseType responseType;
	private Boolean replaceOriginal;
	private Boolean deleteOriginal;
}
