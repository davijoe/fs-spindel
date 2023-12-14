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
    private String isbn;
    private String description;
    private String genre;
    private String publisher;
    private String publishDate;
    private String language;
    private int pages;


    public BookResponse(Book b, boolean includeAll){
        this.id = b.getId();
        this.title = b.getTitle();
        this.author = b.getAuthor();
        this.isbn = b.getIsbn();
        this.description = b.getDescription();
        this.genre = b.getGenre();
        this.publisher = b.getPublisher();
        this.publishDate = b.getPublishDate().toString();
        this.language = b.getLanguage();
        this.pages = b.getPages();
    }
}
