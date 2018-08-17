package demo.plusfriend;

/**
 * https://github.com/sjh836/Spring_KakaoBot_Sample
 */
public class Message {

    private String text;
    private Photo photo;
    private MessageButton messageButton;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public MessageButton getMessageButton() {
        return messageButton;
    }

    public void setMessageButton(MessageButton messageButton) {
        this.messageButton = messageButton;
    }

    @Override
    public String toString() {
        return "Message{" + "text='" + text + '\'' + ", photo=" + photo + ", messageButton=" + messageButton + '}';
    }
}
