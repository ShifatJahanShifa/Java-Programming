public enum MenuOption {
    ZERO_BALANCE(1),CREDIT_BALANCE(2),DEBIT_BALANCE(3),END(4);

    private final int option;

    MenuOption(int value)
    {
        option=value;
    }

    public int getOption() {
        return option;
    }
}
