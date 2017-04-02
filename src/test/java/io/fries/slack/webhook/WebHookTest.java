package io.fries.slack.webhook;

import io.fries.slack.webhook.message.*;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class WebHookTest {
	
	private static final String WEBHOOK_URL = "https://hooks.slack.com/services/TXXXXX/BXXXXX/XXXXXXXXXXXX";
	
	@Test
	public void shouldReturnOK() throws Exception {
		String response = new WebHook(WEBHOOK_URL).send(
			Message.builder()
				.username("SlackBOT")
				.iconEmoji(":robot_face:")
				.attachments(
					Collections.singletonList(
						Attachment.builder()
							.color("#3AA3E3")
							.title("Some messages")
							.fallback("Notification message")
							.fields(
								Collections.singletonList(
									Field.builder()
										.title("Title 1")
										.value("Because, you know?")
										.build()
								)
							)
							.actions(
								Collections.singletonList(
									Action.builder()
										.name("btn")
										.text("Some button")
										.value("btn")
										.type("button")
										.confirm(Confirmation.builder()
											.title("Are you sure?")
											.text("Really sure?")
											.okText("Yes")
											.dismissText("No")
											.build()
										).build()
								)
							).build()
					)
				).build()
		);
		
		assertThat(response).isEqualTo("ok");
	}
	
	@Test(expected = MalformedURLException.class)
	public void shouldThrowAnExceptionOnInvalidWebHookUrl() throws Exception {
		final String EMPTY_URL = "";
		new WebHook(EMPTY_URL).send(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowAnExceptionOnNullMessage() throws Exception {
		new WebHook(WEBHOOK_URL).send(null);
	}
}