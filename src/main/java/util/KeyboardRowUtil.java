package util;

import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;

public class KeyboardRowUtil {

    /**
     * Создает простую строку для клавиатуры
     *
     * @param name наименование строки
     * @return созданный объект
     */
    public static KeyboardRow create(String name) {
        KeyboardRow keyboardRow = new KeyboardRow();
        KeyboardButton keyboardButton = new KeyboardButton(name);

        keyboardRow.add(keyboardButton);

        return keyboardRow;
    }
}
