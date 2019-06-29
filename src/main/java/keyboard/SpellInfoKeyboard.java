package keyboard;

import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import util.KeyboardRowUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Клавиатура для определения критерия выбора заклинания
 */
public class SpellInfoKeyboard extends ReplyKeyboardMarkup {

    {
        this.setSelective(true);
        this.setResizeKeyboard(true);
        this.setOneTimeKeyboard(false);

        this.setKeyboard(createKeyboard());
    }

    /**
     * Создает клавиатуру
     */
    private List<KeyboardRow> createKeyboard() {
        List<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();
        keyboard.add(KeyboardRowUtil.create("Все"));
        keyboard.add(KeyboardRowUtil.create("По классу"));
        keyboard.add(KeyboardRowUtil.create("По уровню"));
        return keyboard;
    }

}
