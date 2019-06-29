import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import sendmessage.StartSendMessage;

public class HandbookBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update)  {
        try {
            sendApiMethod(new StartSendMessage(update.getMessage().getChatId()));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public String getBotUsername() {
        return "HandbookBot";
    }

    public String getBotToken() {
        return "744764565:AAFb8ghSNN8a4Tthxr9cLauWH92k1FpyZeI";
    }
}
