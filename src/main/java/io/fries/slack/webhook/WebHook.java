package io.fries.slack.webhook;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
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
	
	public Optional<String> send(Message message) {
		try {
			HttpResponse<String> response = Unirest.post(url.toString())
												   	.header(HTTP.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType())
													.body(gson.toJson(message))
													.asObject(String.class);
			
			return Optional.ofNullable(response.getBody());
		}
		catch(UnirestException e) {
			e.printStackTrace();
			return Optional.empty();
		}
	}
	
	@Override
	public String toString() {
		return url.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		
		WebHook webHook = (WebHook)o;
		return url.equals(webHook.url);
	}
	
	@Override
	public int hashCode() {
		return url.hashCode();
	}
}
