package demo.plusfriend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * https://github.com/sjh836/Spring_KakaoBot_Sample
 */
public class RequestMessage {

    private String userKey;
    private String type;
    private String content;

    @JsonProperty("user_key")
    public String getUserKey() {
        return userKey;
    }

    @JsonSetter("user_key")
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "RequestMessage{" + "userKey='" + userKey + '\'' + ", type='" + type + '\'' + ", content='" + content + '\'' + '}';
    }
}
