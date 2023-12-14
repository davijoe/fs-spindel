package davijoe.fsspindel.repository;

import davijoe.fsspindel.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    // JpaRepository extender ListPagingAndSortingRepository som ligeledes extender PagingAndSortingRepository

}
