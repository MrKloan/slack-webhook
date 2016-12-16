package io.fries.slack.webhook.message;

public class Action {
	
	enum Style { DEFAULT, PRIMARY, DANGER }
	
	private String name;
	private String text;
	
	private Style style;
	private String type;
	
	private String value;
	private Confirmation confirm;
	
	public Action name(String name) {
		this.name = name;
		return this;
	}
	
	public Action text(String text) {
		this.text = text;
		return this;
	}
	
	public Action style(Style style) {
		this.style = style;
		return this;
	}
	
	public Action type(String type) {
		this.type = type;
		return this;
	}
	
	public Action value(String value) {
		this.value = value;
		return this;
	}
	
	public Action confirm(Confirmation confirm) {
		this.confirm = confirm;
		return this;
	}
	
	@Override
	public String toString() {
		return "Action{" +
			"name='" + name + '\'' +
			", text='" + text + '\'' +
			", style=" + style +
			", type='" + type + '\'' +
			", value='" + value + '\'' +
			", confirm=" + confirm +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Action action = (Action) o;
		
		if (name != null ? !name.equals(action.name) : action.name != null) return false;
		if (text != null ? !text.equals(action.text) : action.text != null) return false;
		if (style != action.style) return false;
		if (type != null ? !type.equals(action.type) : action.type != null) return false;
		if (value != null ? !value.equals(action.value) : action.value != null) return false;
		return confirm != null ? confirm.equals(action.confirm) : action.confirm == null;
	}
	
	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (style != null ? style.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (confirm != null ? confirm.hashCode() : 0);
		return result;
	}
}
