package Library.Model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created by sachin on 9/2/15.
 */
@XmlRootElement
public class Data {
    String bookName;
    int studentId;
    String issueDate;
    String dueDate;


    public Data(){

    }

    public Data(String bookName, int studentId, String issueDate, String dueDate) {
        this.bookName = bookName;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
