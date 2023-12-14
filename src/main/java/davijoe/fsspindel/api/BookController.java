package davijoe.fsspindel.api;

import davijoe.fsspindel.dto.BookResponse;
import davijoe.fsspindel.entity.Book;
import davijoe.fsspindel.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping
    public Page<BookResponse> getAllBooks(Pageable pageable) {
        System.out.println("pageable = " + pageable); //Add a breakpoint here, and investigate the pageable instance
        return bookService.getAllBooks(pageable);
    }
}

