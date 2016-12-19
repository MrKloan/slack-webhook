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
	new Message()
	    .username("slack-webhook API")
	    .iconEmoji(":robot_face:")
	    .text("This is not a test!")
);
```

Add one or more `Attachment`s:
```java
webHook.send(
	new Message()
	    .attachment(
	    	new Attachment()
	    	    .color("#3AA3E3")
	    	    .title("Some message")
	    )
);
```

Compose more complex messages using `Field`s and `Action`s:
```java
webHook.send(
	new Message()
	    .username("slack-webhook API")
	    .iconEmoji(":robot_face:")
	    .text("This is not a test!")
	    .attachment(
	    	new Attachment()
	    	    .color("#3AA3E3")
	    	    .title("Some message")
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
	    	    	    .type("button")
	    	    )
	    )
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
        <version>1.0-RC2</version>
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
    compile 'io.fries:slack-webhook:1.0-RC2'
}
```