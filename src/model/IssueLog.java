package library.model;

import java.time.LocalDate;

public class IssueLog {
    private int id;
    private int bookId;
    private int studentId;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public IssueLog(int id, int bookId, int studentId, LocalDate issueDate, LocalDate returnDate) {
        this.id = id;
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    // Getters and Setters
}
