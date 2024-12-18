package sachith.dev.librarymanagmentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookDto {

    private String bookCode;
    private String bookName;
    private String author;
    private Boolean available;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
    private CategoryDto categoryDto;
}
