package bridge.bridge;

public class AcademiaFormatter implements  IFormatter {
    @Override
    public void format(String title, String content) {
        System.out.printf("%s\n", "-".repeat(22));
        System.out.format("%-3s %s %3s\n", "*", "Academia Paper", "*");
        System.out.printf("%s\n", "-".repeat(22));
        System.out.format("%s\n", title);
        System.out.format("%s\n", content);
    }
}
