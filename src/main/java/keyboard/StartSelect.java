package keyboard;

import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import util.KeyboardRowUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Форма выбора типа информации к получению (Заклинания, классы, рассы...)
 */
public class StartSelect extends ReplyKeyboardMarkup {

    {
        this.setSelective(true);
        this.setResizeKeyboard(true);
        this.setOneTimeKeyboard(false);

        this.setKeyboard(createKeyboard());
    }

    /**
     * Создает клавиатуру
     */
    private static List<KeyboardRow> createKeyboard() {
        List<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();
        keyboard.add(KeyboardRowUtil.create("Заклинания"));
        return keyboard;
    }

}
