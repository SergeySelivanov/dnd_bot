package command;

public enum Command {
    /**
     * Отображение информации о возможных вариантах построения запроса для получения данных по заклинаниям
     */
    SPELL_INFO("/spell_info");

    private String command;

    Command(String command) {
        this.command = command;
    }
}
