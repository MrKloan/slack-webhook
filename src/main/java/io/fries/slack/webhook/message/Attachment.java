package io.fries.slack.webhook.message;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
	
	private final List<Field> fields;
	private final List<Action> actions;
	
	public Attachment() {
		this.fields = new ArrayList<>();
		this.actions = new ArrayList<>();
	}
	
	public String callbackId() {
		return callbackId;
	}
	
	public Attachment callbackId(String callbackId) {
		this.callbackId = callbackId;
		return this;
	}
	
	public String fallback() {
		return fallback;
	}
	
	public Attachment fallback(String fallback) {
		this.fallback = fallback;
		return this;
	}
	
	public String text() {
		return text;
	}
	
	public Attachment text(String text) {
		this.text = text;
		return this;
	}
	
	public String title() {
		return title;
	}
	
	public Attachment title(String title) {
		this.title = title;
		return this;
	}
	
	public URL titleLink() {
		return titleLink;
	}
	
	public Attachment titleLink(URL titleLink) {
		this.titleLink = titleLink;
		return this;
	}
	
	public String color() {
		return color;
	}
	
	public Attachment color(String color) {
		this.color = color;
		return this;
	}
	
	public String pretext() {
		return pretext;
	}
	
	public Attachment pretext(String pretext) {
		this.pretext = pretext;
		return this;
	}
	
	public String authorName() {
		return authorName;
	}
	
	public Attachment authorName(String authorName) {
		this.authorName = authorName;
		return this;
	}
	
	public URL authorLink() {
		return authorLink;
	}
	
	public Attachment authorLink(URL authorLink) {
		this.authorLink = authorLink;
		return this;
	}
	
	public URL authorIcon() {
		return authorIcon;
	}
	
	public Attachment authorIcon(URL authorIcon) {
		this.authorIcon = authorIcon;
		return this;
	}
	
	public URL imageUrl() {
		return imageUrl;
	}
	
	public Attachment imageUrl(URL imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}
	
	public URL thumbUrl() {
		return thumbUrl;
	}
	
	public Attachment thumbUrl(URL thumbUrl) {
		this.thumbUrl = thumbUrl;
		return this;
	}
	
	public String footer() {
		return footer;
	}
	
	public Attachment footer(String footer) {
		this.footer = footer;
		return this;
	}
	
	public URL footerIcon() {
		return footerIcon;
	}
	
	public Attachment footerIcon(URL footerIcon) {
		this.footerIcon = footerIcon;
		return this;
	}
	
	public Long ts() {
		return ts;
	}
	
	public Attachment ts(Long ts) {
		this.ts = ts;
		return this;
	}
	
	public List<Field> fields() {
		return fields;
	}
	
	public Attachment field(Field field) {
		fields.add(field);
		return this;
	}
	
	public List<Action> actions() {
		return actions;
	}
	
	public Attachment action(Action action) {
		actions.add(action);
		return this;
	}
	
	@Override
	public String toString() {
		return "Attachment{" +
			"callbackId='" + callbackId + '\'' +
			", fallback='" + fallback + '\'' +
			", text='" + text + '\'' +
			", title='" + title + '\'' +
			", titleLink=" + titleLink +
			", color='" + color + '\'' +
			", pretext='" + pretext + '\'' +
			", authorName='" + authorName + '\'' +
			", authorLink=" + authorLink +
			", authorIcon=" + authorIcon +
			", imageUrl=" + imageUrl +
			", thumbUrl=" + thumbUrl +
			", footer='" + footer + '\'' +
			", footerIcon=" + footerIcon +
			", ts=" + ts +
			", fields=" + fields +
			", actions=" + actions +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Attachment that = (Attachment) o;
		
		if (callbackId != null ? !callbackId.equals(that.callbackId) : that.callbackId != null) return false;
		if (fallback != null ? !fallback.equals(that.fallback) : that.fallback != null) return false;
		if (text != null ? !text.equals(that.text) : that.text != null) return false;
		if (title != null ? !title.equals(that.title) : that.title != null) return false;
		if (titleLink != null ? !titleLink.equals(that.titleLink) : that.titleLink != null) return false;
		if (color != null ? !color.equals(that.color) : that.color != null) return false;
		if (pretext != null ? !pretext.equals(that.pretext) : that.pretext != null) return false;
		if (authorName != null ? !authorName.equals(that.authorName) : that.authorName != null) return false;
		if (authorLink != null ? !authorLink.equals(that.authorLink) : that.authorLink != null) return false;
		if (authorIcon != null ? !authorIcon.equals(that.authorIcon) : that.authorIcon != null) return false;
		if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) return false;
		if (thumbUrl != null ? !thumbUrl.equals(that.thumbUrl) : that.thumbUrl != null) return false;
		if (footer != null ? !footer.equals(that.footer) : that.footer != null) return false;
		if (footerIcon != null ? !footerIcon.equals(that.footerIcon) : that.footerIcon != null) return false;
		if (ts != null ? !ts.equals(that.ts) : that.ts != null) return false;
		if (fields != null ? !fields.equals(that.fields) : that.fields != null) return false;
		return actions != null ? actions.equals(that.actions) : that.actions == null;
	}
	
	@Override
	public int hashCode() {
		int result = callbackId != null ? callbackId.hashCode() : 0;
		result = 31 * result + (fallback != null ? fallback.hashCode() : 0);
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (titleLink != null ? titleLink.hashCode() : 0);
		result = 31 * result + (color != null ? color.hashCode() : 0);
		result = 31 * result + (pretext != null ? pretext.hashCode() : 0);
		result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
		result = 31 * result + (authorLink != null ? authorLink.hashCode() : 0);
		result = 31 * result + (authorIcon != null ? authorIcon.hashCode() : 0);
		result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
		result = 31 * result + (thumbUrl != null ? thumbUrl.hashCode() : 0);
		result = 31 * result + (footer != null ? footer.hashCode() : 0);
		result = 31 * result + (footerIcon != null ? footerIcon.hashCode() : 0);
		result = 31 * result + (ts != null ? ts.hashCode() : 0);
		result = 31 * result + (fields != null ? fields.hashCode() : 0);
		result = 31 * result + (actions != null ? actions.hashCode() : 0);
		return result;
	}
}
