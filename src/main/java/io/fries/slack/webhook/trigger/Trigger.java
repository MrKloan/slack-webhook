package io.fries.slack.webhook.trigger;

public class Trigger {
	
	private String token;
	private String teamId;
	private String teamDomain;
	
	private String channelId;
	private String channelName;
	
	private String userId;
	private String userName;
	
	private String command;
	private String triggerWord;
	private String text;
	
	private String responseUrl;
	
	public String token() {
		return token;
	}
	
	public Trigger token(String token) {
		this.token = token;
		return this;
	}
	
	public String teamId() {
		return teamId;
	}
	
	public Trigger teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}
	
	public String teamDomain() {
		return teamDomain;
	}
	
	public Trigger teamDomain(String teamDomain) {
		this.teamDomain = teamDomain;
		return this;
	}
	
	public String channelId() {
		return channelId;
	}
	
	public Trigger channelId(String channelId) {
		this.channelId = channelId;
		return this;
	}
	
	public String channelName() {
		return channelName;
	}
	
	public Trigger channelName(String channelName) {
		this.channelName = channelName;
		return this;
	}
	
	public String userId() {
		return userId;
	}
	
	public Trigger userId(String userId) {
		this.userId = userId;
		return this;
	}
	
	public String userName() {
		return userName;
	}
	
	public Trigger userName(String userName) {
		this.userName = userName;
		return this;
	}
	
	public String command() {
		return command;
	}
	
	public Trigger command(String command) {
		this.command = command;
		return this;
	}
	
	public String triggerWord() {
		return triggerWord;
	}
	
	public Trigger triggerWord(String triggerWord) {
		this.triggerWord = triggerWord;
		return this;
	}
	
	public String text() {
		return text;
	}
	
	public Trigger text(String text) {
		this.text = text;
		return this;
	}
	
	public String responseUrl() {
		return responseUrl;
	}
	
	public Trigger responseUrl(String responseUrl) {
		this.responseUrl = responseUrl;
		return this;
	}
	
	@Override
	public String toString() {
		return "Trigger{" +
			"token='" + token + '\'' +
			", teamId='" + teamId + '\'' +
			", teamDomain='" + teamDomain + '\'' +
			", channelId='" + channelId + '\'' +
			", channelName='" + channelName + '\'' +
			", userId='" + userId + '\'' +
			", userName='" + userName + '\'' +
			", command='" + command + '\'' +
			", triggerWord='" + triggerWord + '\'' +
			", text='" + text + '\'' +
			", responseUrl='" + responseUrl + '\'' +
			'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Trigger trigger = (Trigger) o;
		
		if (token != null ? !token.equals(trigger.token) : trigger.token != null) return false;
		if (teamId != null ? !teamId.equals(trigger.teamId) : trigger.teamId != null) return false;
		if (teamDomain != null ? !teamDomain.equals(trigger.teamDomain) : trigger.teamDomain != null) return false;
		if (channelId != null ? !channelId.equals(trigger.channelId) : trigger.channelId != null) return false;
		if (channelName != null ? !channelName.equals(trigger.channelName) : trigger.channelName != null) return false;
		if (userId != null ? !userId.equals(trigger.userId) : trigger.userId != null) return false;
		if (userName != null ? !userName.equals(trigger.userName) : trigger.userName != null) return false;
		if (command != null ? !command.equals(trigger.command) : trigger.command != null) return false;
		if (triggerWord != null ? !triggerWord.equals(trigger.triggerWord) : trigger.triggerWord != null) return false;
		if (text != null ? !text.equals(trigger.text) : trigger.text != null) return false;
		return responseUrl != null ? responseUrl.equals(trigger.responseUrl) : trigger.responseUrl == null;
	}
	
	@Override
	public int hashCode() {
		int result = token != null ? token.hashCode() : 0;
		result = 31 * result + (teamId != null ? teamId.hashCode() : 0);
		result = 31 * result + (teamDomain != null ? teamDomain.hashCode() : 0);
		result = 31 * result + (channelId != null ? channelId.hashCode() : 0);
		result = 31 * result + (channelName != null ? channelName.hashCode() : 0);
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		result = 31 * result + (userName != null ? userName.hashCode() : 0);
		result = 31 * result + (command != null ? command.hashCode() : 0);
		result = 31 * result + (triggerWord != null ? triggerWord.hashCode() : 0);
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (responseUrl != null ? responseUrl.hashCode() : 0);
		return result;
	}
}
