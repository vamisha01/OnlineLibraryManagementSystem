package library.ui;

import javax.swing.*;

public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        setTitle("Library Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Books", new BookPanel());
        tabs.add("Students", new StudentPanel());
        tabs.add("Issue Logs", new IssueLogPanel());

        add(tabs);
        setVisible(true);
    }
}
