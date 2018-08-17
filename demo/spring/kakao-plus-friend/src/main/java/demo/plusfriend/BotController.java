package demo.plusfriend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/sjh836/Spring_KakaoBot_Sample
 */
@RestController
public class BotController {

    @GetMapping(value = "/keyboard")
    public Keyboard keyboard() {
        Keyboard keyboard = new Keyboard(new String[] {"사진", "라벨", "에코메시지"});
        return keyboard;
    }

    @PostMapping(value = "/message")
    public ResponseMessage message(@RequestBody RequestMessage requestMessage) {
        ResponseMessage response = new ResponseMessage();
        Message message = new Message();

        if (requestMessage.getContent().equals("메인화면")) {
            message.setText("첫 화면을 호출");

            Keyboard keyboard = new Keyboard(new String[] {"사진", "라벨", "에코메세지"});
            response.setKeyboard(keyboard);
        } else if (requestMessage.getContent().equals("사진")) {
            Photo photo = new Photo();

            photo.setUrl("http://placehold.it/640x480.jpg");
            photo.setWidth(640);
            photo.setHeight(480);

            message.setPhoto(photo);
            message.setText(requestMessage.getContent());
        } else if (requestMessage.getContent().equals("라벨")) {
            MessageButton messageButton = new MessageButton();

            messageButton.setLabel("GITHUB");
            messageButton.setUrl("https://github.com/zacscoding");

            message.setMessageButton(messageButton);
            message.setText("message button 추가");
        } else {
            message.setText(requestMessage.getContent());
        }

        response.setMessage(message);
        return response;
    }
}
