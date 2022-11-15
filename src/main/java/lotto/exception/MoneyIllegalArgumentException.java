package lotto.exception;

public class MoneyIllegalArgumentException extends IllegalArgumentException {
    private String message;

    public MoneyIllegalArgumentException(String message) {
        super(ExceptionUtil.ERROR_PREFIX + message);
        System.out.println(ExceptionUtil.ERROR_PREFIX + message);
    }
}
