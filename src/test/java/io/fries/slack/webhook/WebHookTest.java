package io.fries.slack.webhook;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class WebHookTest {
	
	private static final String WEBHOOK_URL = "https://hooks.slack.com/services/TXXXXXX/BXXXXXX/XXXXXXXXXX";
	
	@Ignore
	@Test
	public void test() throws Exception {
		Optional<String> response = new WebHook(WEBHOOK_URL).send(
			new Message()
				.username("slack-webhook API")
				.iconEmoji(":robot_face:")
				.mrkdwn(true)
				.text("This is a *test*!")
				.attachment(
					new Attachment()
						.color("#3AA3E3")
						.title("Some messages")
						.field(
							new Field()
								.title("Title 1")
								.value("Because, you know?")
								.shortField(true)
						)
						.field(
							new Field()
								.title("Title 2")
								.value("Another reason")
								.shortField(true)
						)
						.action(
							new Action()
								.name("btn")
								.text("Some button")
								.value("btn")
						)
				)
		);
		
		assertThat(response.isPresent()).isTrue();
		assertThat(response.get()).isEqualTo("ok");
	}
}