package sachith.dev.librarymanagmentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RoleDto {

    private String roleCode;
    private String roleName;
    private boolean roleView;
    private boolean roleUpdate;
    private boolean roleDelete;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
}
