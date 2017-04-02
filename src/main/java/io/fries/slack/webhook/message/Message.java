package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Message {
	
	enum ResponseType { IN_CHANNEL, EPHEMERAL }
	
	private final String username;
	private final String iconEmoji;
	private final String channel;
	
	private final String text;
	private final Boolean mrkdwn;
	
	private final List<Attachment> attachments;
	
	private final ResponseType responseType;
	private final Boolean replaceOriginal;
	private final Boolean deleteOriginal;
}
