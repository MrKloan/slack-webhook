package io.fries.slack.webhook;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.fries.slack.webhook.message.Message;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HTTP;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class WebHook {
	
	private final URL url;
	private final Gson gson;
	
	public WebHook(String url) throws MalformedURLException {
		this(new URL(url));
	}
	
	public WebHook(URL url) {
		this.url = url;
		this.gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
	}
	
	public String send(Message message) {
		if(message == null)
			throw new IllegalArgumentException("WebHook message cannot be null.");
		
		try {
			HttpResponse<String> response = Unirest.post(url.toString())
				.header(HTTP.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType())
				.body(gson.toJson(message))
				.asObject(String.class);
			
			return response.getBody();
		}
		catch(UnirestException e) {
			throw new SlackWebHookException(e.getMessage(), e);
		}
	}
}
