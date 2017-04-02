package io.fries.slack.webhook.message;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Field {

	private final String title;
	private final String value;
	@SerializedName("short")
	private final Boolean shortField;
}
