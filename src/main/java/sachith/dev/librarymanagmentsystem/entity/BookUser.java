package sachith.dev.librarymanagmentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "books_users")
public class BookUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bu_id")
    private Integer id;

    @Column(name = "bu_member_code")
    private String memberCode;

    @Column(name = "bu_book_code")
    private String bookCode;

    @Column(name = "borrow_date")
    private Date borrowDate;

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "original_return_date")
    private Date originalReturnDate;

    @Column(name = "reminder_send")
    private boolean reminderSend;


}
