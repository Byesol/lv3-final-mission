package library.book.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import library.book.dto.BookResponse;
import library.book.infrastructure.BookApiClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookApiClient bookApiClient;

    public BookController(BookApiClient bookApiClient) {
        this.bookApiClient = bookApiClient;
    }

    @Operation(summary = "도서 검색", description = "키워드를 통해 외부 도서 정보를 검색합니다.")
    @GetMapping("/books/search")
    public ResponseEntity<BookResponse> searchBooks(
            @Parameter(description = "검색할 키워드", required = true, example = "자바") @RequestParam("query") String query) {
        BookResponse response = bookApiClient.searchBook(query);
        return ResponseEntity.ok(response);
    }
}
