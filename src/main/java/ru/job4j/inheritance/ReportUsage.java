package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        // TextReport report = new TextReport();
        // HtmlReport report = new HtmlReport();
        JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
