package io.fries.slack.webhook.message;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Field {

	private String title;
	private String value;
	@SerializedName("short")
	private Boolean shortField;
}
