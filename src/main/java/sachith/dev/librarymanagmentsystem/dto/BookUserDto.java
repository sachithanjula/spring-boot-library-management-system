package sachith.dev.librarymanagmentsystem.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookUserDto {

    private Integer id;
    private String memberCode;
    private String bookCode;
    private Date borrowDate;
    private Date returnDate;
    private Date originalReturnDate;
    private boolean reminderSend;
}
