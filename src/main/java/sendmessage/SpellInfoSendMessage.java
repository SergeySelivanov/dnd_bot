package sendmessage;

import keyboard.SpellInfoKeyboard;
import org.telegram.telegrambots.api.methods.send.SendMessage;

public class SpellInfoSendMessage extends SendMessage {

    public SpellInfoSendMessage(Long chatId) {
        super();
        this.setChatId(chatId);
    }

    {
        this.setText("Критерий для отбора заклинаний");
        this.setReplyMarkup(new SpellInfoKeyboard());
    }
}
