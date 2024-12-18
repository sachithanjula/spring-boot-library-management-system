package sachith.dev.librarymanagmentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MemberDto {


    private String memberCode;
    private  String name;
    private  String address;
    private String phone;
    private String email;
    private String username;
    private String password;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
    private RoleDto roleDto;
}
