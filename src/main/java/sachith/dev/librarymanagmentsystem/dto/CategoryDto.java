package sachith.dev.librarymanagmentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CategoryDto {

    private String categoryCode;
    private String categoryName;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
}
