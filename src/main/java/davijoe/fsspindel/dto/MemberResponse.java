package davijoe.fsspindel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import davijoe.fsspindel.entity.Member;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class MemberResponse {

    private Long id;
    private String email;
    private LocalDateTime dateCreated;
    private LocalDateTime lastLogin;


    public MemberResponse(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public MemberResponse(Member m, boolean includeAll) {
        this.id = m.getId();
        this.email = m.getEmail();
        if (includeAll) {
            this.dateCreated = m.getDateCreated();
            this.lastLogin = m.getLastLogin();
        }
    }

    public MemberResponse(Member m) {
    }
}
