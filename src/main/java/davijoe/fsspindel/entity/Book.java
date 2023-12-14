package davijoe.fsspindel.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private String isbn;
    @Lob
    private String description;
    private String genre;
    private String publisher;
    @Column(columnDefinition = "DATE")  // https://stackoverflow.com/questions/23858335/hibernate-4-3-5-date-and-time-issue
    private LocalDateTime publishDate;
    private String language;
    private int pages;

}
