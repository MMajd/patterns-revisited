package ChainOfResposibility.Abstract;

public enum ApprovalResponse {
    APPROVED("Approved"),
    BEYOUND_LIMIT("Beyound limit"),
    DENINED("Denied");

    private final String value;

    private ApprovalResponse(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
