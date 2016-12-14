package io.fries.slack.webhook;

import com.google.gson.annotations.SerializedName;

public class Field {

	private String title;
	private String value;
	@SerializedName("short")
	private Boolean shortField;
	
	public String title() {
		return title;
	}
	
	public Field title(String title) {
		this.title = title;
		return this;
	}
	
	public String value() {
		return value;
	}
	
	public Field value(String value) {
		this.value = value;
		return this;
	}
	
	public Boolean shortField() {
		return shortField;
	}
	
	public Field shortField(Boolean shortField) {
		this.shortField = shortField;
		return this;
	}
	
	@Override
	public String toString() {
		return "Field{" +
			"title='" + title + '\'' +
			", value='" + value + '\'' +
			", shortField=" + shortField +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Field field = (Field) o;
		
		if (title != null ? !title.equals(field.title) : field.title != null) return false;
		if (value != null ? !value.equals(field.value) : field.value != null) return false;
		return shortField != null ? shortField.equals(field.shortField) : field.shortField == null;
	}
	
	@Override
	public int hashCode() {
		int result = title != null ? title.hashCode() : 0;
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (shortField != null ? shortField.hashCode() : 0);
		return result;
	}
}
