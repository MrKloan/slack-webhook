package io.fries.slack.webhook;

import io.fries.slack.webhook.message.*;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class WebHookTest {
	
	private static final String WEBHOOK_URL = "https://hooks.slack.com/services/TXXXXXX/BXXXXXX/XXXXXXXXXX";
	
	@Test
	public void test() throws Exception {
		Optional<String> response = new WebHook(WEBHOOK_URL).send(
			new Message()
				.username("SlackBOT")
				.iconEmoji(":robot_face:")
				.attachment(
					new Attachment()
						.color("#3AA3E3")
						.title("Some messages")
						.fallback("Notification message")
						.field(
							new Field()
								.title("Title 1")
								.value("Because, you know?")
						)
						.action(
							new Action()
								.name("btn")
								.text("Some button")
								.value("btn")
								.type("button")
								.confirm(new Confirmation()
									.title("Are you sure?")
									.text("Really sure?")
									.okText("Yes")
									.dismissText("No")
								)
						)
				)
		);
		
		assertThat(response.isPresent()).isTrue();
		assertThat(response.get()).isEqualTo("ok");
	}
}