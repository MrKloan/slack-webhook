package io.fries.slack.webhook.message;

import lombok.Builder;
import lombok.Data;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Attachment {
	
	private String callbackId;
	
	private String fallback;
	private String text;
	
	private String title;
	private URL titleLink;
	
	private String color;
	private String pretext;
	
	private String authorName;
	private URL authorLink;
	private URL authorIcon;
	
	private URL imageUrl;
	private URL thumbUrl;
	
	private String footer;
	private URL footerIcon;
	
	private Long ts;
	
	private List<Field> fields;
	private List<Action> actions;
}
