package io.fries.slack.webhook.message;

public class Confirmation {
	
	private String title;
	private String text;
	private String okText;
	private String dismissText;
	
	public String title() {
		return title;
	}
	
	public Confirmation title(String title) {
		this.title = title;
		return this;
	}
	
	public String text() {
		return text;
	}
	
	public Confirmation text(String text) {
		this.text = text;
		return this;
	}
	
	public String okText() {
		return okText;
	}
	
	public Confirmation okText(String okText) {
		this.okText = okText;
		return this;
	}
	
	public String dismissText() {
		return dismissText;
	}
	
	public Confirmation dismissText(String dismissText) {
		this.dismissText = dismissText;
		return this;
	}
	
	@Override
	public String toString() {
		return "Confirmation{" +
			"title='" + title + '\'' +
			", text='" + text + '\'' +
			", okText='" + okText + '\'' +
			", dismissText='" + dismissText + '\'' +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Confirmation that = (Confirmation) o;
		
		if (title != null ? !title.equals(that.title) : that.title != null) return false;
		if (text != null ? !text.equals(that.text) : that.text != null) return false;
		if (okText != null ? !okText.equals(that.okText) : that.okText != null) return false;
		return dismissText != null ? dismissText.equals(that.dismissText) : that.dismissText == null;
	}
	
	@Override
	public int hashCode() {
		int result = title != null ? title.hashCode() : 0;
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (okText != null ? okText.hashCode() : 0);
		result = 31 * result + (dismissText != null ? dismissText.hashCode() : 0);
		return result;
	}
}
