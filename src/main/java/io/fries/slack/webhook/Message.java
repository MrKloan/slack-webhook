package io.fries.slack.webhook;

import java.util.ArrayList;
import java.util.List;

public class Message {
	
	enum ResponseType { IN_CHANNEL, EPHEMERAL }
	
	private String username;
	private String iconEmoji;
	private String channel;
	
	private String text;
	private Boolean mrkdwn;
	
	private List<Attachment> attachments;
	
	private ResponseType responseType;
	private Boolean replaceOriginal;
	private Boolean deleteOriginal;
	
	public String username() {
		return username;
	}
	
	public Message username(String username) {
		this.username = username;
		return this;
	}
	
	public String iconEmoji() {
		return iconEmoji;
	}
	
	public Message iconEmoji(String iconEmoji) {
		this.iconEmoji = iconEmoji;
		return this;
	}
	
	public String channel() {
		return channel;
	}
	
	public Message channel(String channel) {
		this.channel = channel;
		return this;
	}
	
	public String text() {
		return text;
	}
	
	public Message text(String text) {
		this.text = text;
		return this;
	}
	
	public Boolean mrkdwn() {
		return mrkdwn;
	}
	
	public Message mrkdwn(boolean mrkdwn) {
		this.mrkdwn = mrkdwn;
		return this;
	}
	
	public List<Attachment> attachments() {
		return attachments;
	}
	
	public Message attachment(Attachment attachment) {
		if(attachments == null)
			attachments = new ArrayList<>();
		attachments.add(attachment);
		
		return this;
	}
	
	public ResponseType responseType() {
		return responseType;
	}
	
	public Message responseType(ResponseType responseType) {
		this.responseType = responseType;
		return this;
	}
	
	public Boolean replaceOriginal() {
		return replaceOriginal;
	}
	
	public Message replaceOriginal(boolean replaceOriginal) {
		this.replaceOriginal = replaceOriginal;
		return this;
	}
	
	public Boolean deleteOriginal() {
		return deleteOriginal;
	}
	
	public Message deleteOriginal(boolean deleteOriginal) {
		this.deleteOriginal = deleteOriginal;
		return this;
	}
	
	@Override
	public String toString() {
		return "Message{" +
			"username='" + username + '\'' +
			", iconEmoji='" + iconEmoji + '\'' +
			", channel='" + channel + '\'' +
			", text='" + text + '\'' +
			", mrkdwn=" + mrkdwn +
			", attachments=" + attachments +
			", responseType=" + responseType +
			", replaceOriginal=" + replaceOriginal +
			", deleteOriginal=" + deleteOriginal +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Message message = (Message) o;
		
		if (username != null ? !username.equals(message.username) : message.username != null) return false;
		if (iconEmoji != null ? !iconEmoji.equals(message.iconEmoji) : message.iconEmoji != null) return false;
		if (channel != null ? !channel.equals(message.channel) : message.channel != null) return false;
		if (text != null ? !text.equals(message.text) : message.text != null) return false;
		if (mrkdwn != null ? !mrkdwn.equals(message.mrkdwn) : message.mrkdwn != null) return false;
		if (attachments != null ? !attachments.equals(message.attachments) : message.attachments != null) return false;
		if (responseType != message.responseType) return false;
		if (replaceOriginal != null ? !replaceOriginal.equals(message.replaceOriginal) : message.replaceOriginal != null)
			return false;
		return deleteOriginal != null ? deleteOriginal.equals(message.deleteOriginal) : message.deleteOriginal == null;
	}
	
	@Override
	public int hashCode() {
		int result = username != null ? username.hashCode() : 0;
		result = 31 * result + (iconEmoji != null ? iconEmoji.hashCode() : 0);
		result = 31 * result + (channel != null ? channel.hashCode() : 0);
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (mrkdwn != null ? mrkdwn.hashCode() : 0);
		result = 31 * result + (attachments != null ? attachments.hashCode() : 0);
		result = 31 * result + (responseType != null ? responseType.hashCode() : 0);
		result = 31 * result + (replaceOriginal != null ? replaceOriginal.hashCode() : 0);
		result = 31 * result + (deleteOriginal != null ? deleteOriginal.hashCode() : 0);
		return result;
	}
}
