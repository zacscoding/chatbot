package demo.plusfriend;

import java.util.Arrays;

/**
 * https://github.com/sjh836/Spring_KakaoBot_Sample
 */
public class Keyboard {

    private String type = "buttons";
    private String[] buttons;

    public Keyboard(String[] buttons) {
        this.buttons = buttons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getButtons() {
        return buttons;
    }

    public void setButtons(String[] buttons) {
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "type='" + type + '\'' + ", buttons=" + Arrays.toString(buttons) + '}';
    }
}
