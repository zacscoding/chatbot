package demo.plusfriend;

/**
 * https://github.com/sjh836/Spring_KakaoBot_Sample
 */
public class Photo {

    private String url;
    private int width;
    private int height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Photo{" + "url='" + url + '\'' + ", width=" + width + ", height=" + height + '}';
    }
}
