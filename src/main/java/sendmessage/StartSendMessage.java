package sendmessage;

import keyboard.StartSelect;
import org.telegram.telegrambots.api.methods.send.SendMessage;

public class StartSendMessage extends SendMessage {

    public StartSendMessage(Long chatId) {
        super();
        this.setChatId(chatId);
    }

    {
        this.setText("Выбери, что хочешь узнать");
        this.setReplyMarkup(new StartSelect());
    }
}
