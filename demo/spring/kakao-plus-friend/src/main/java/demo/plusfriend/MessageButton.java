package demo.plusfriend;

/**
 * https://github.com/sjh836/Spring_KakaoBot_Sample
 */
public class MessageButton {

    private String label;
    private String url;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MessageButton{" + "label='" + label + '\'' + ", url='" + url + '\'' + '}';
    }
}