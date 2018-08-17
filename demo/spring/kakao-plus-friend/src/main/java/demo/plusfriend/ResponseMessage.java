package demo.plusfriend;

/**
 * https://github.com/sjh836/Spring_KakaoBot_Sample
 */
public class ResponseMessage {

    private Message message;
    private Keyboard keyboard;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" + "message=" + message + ", keyboard=" + keyboard + '}';
    }
}
