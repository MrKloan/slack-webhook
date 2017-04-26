# slack-webhook

The `slack-webhook` API is a simple library allowing you to interact with *incoming* and *outgoing* webhooks configured
in your [Slack](https://slack.com) teams.

## Usage

Create your `WebHook`:
```java
WebHook webHook = new WebHook("https://hooks.slack.com/services/TXXXXXX/BXXXXXX/XXXXXXXXXX");
```

Simple `Message`: 
```java
webHook.send(
	Message.builder()
	    .username("slack-webhook API")
	    .iconEmoji(":robot_face:")
	    .text("This is not a test!")
	    .build()
);
```

Add one or more `Attachment`s:
```java
webHook.send(
	Message.builder()
	    .attachments(
	    	Collections.singletonList(
                Attachment.builder()
                    .color("#3AA3E3")
                    .title("Some message")
                    .build()
	    	)
	    ).build()
);
```

Compose more complex messages using `Field`s and `Action`s:
```java
webHook.send(
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
```

## Installation

Maven:
```xml
<repositories>
    <repository>
        <id>fries-io</id>
        <name>fries.io Maven Repository</name>
        <url>http://maven.fries.io/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>io.fries</groupId>
        <artifactId>slack-webhook</artifactId>
        <version>1.0-RC6</version>
    </dependency>
</dependencies>
```

Gradle:
```groovy
repositories {
    maven {
        url 'http://maven.fries.io/'
    }
}

dependencies {
    compile 'io.fries:slack-webhook:1.0-RC6'
}
```