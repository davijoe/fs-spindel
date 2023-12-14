package davijoe.fsspindel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import davijoe.fsspindel.entity.Book;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookResponse {
    private int id;
    private String title;
    private String author;
    private String created;
    private String updated;


    public BookResponse(Book b, boolean includeAll){
        this.id = b.getId();
        this.title = b.getTitle();
        this.author = b.getAuthor();
        if(includeAll){
            this.created = b.getCreated().toString();
            this.updated = b.getUpdated().toString();
        }
    }
}
