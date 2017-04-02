package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Attachment {
	
	private final String callbackId;
	
	private final String fallback;
	private final String text;
	
	private final String title;
	private final URL titleLink;
	
	private final String color;
	private final String pretext;
	
	private final String authorName;
	private final URL authorLink;
	private final URL authorIcon;
	
	private final URL imageUrl;
	private final URL thumbUrl;
	
	private final String footer;
	private final URL footerIcon;
	
	private final Long ts;
	
	private final List<Field> fields;
	private final List<Action> actions;
}
