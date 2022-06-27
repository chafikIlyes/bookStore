package com.smartiqa.bookStore.controller;

import com.smartiqa.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

  @GetMapping
  public ResponseEntity<List<BookDto>> getBooks() {

    BookDto book = BookDto.builder()
      .title("Clean Code (Robert Martin, 2008)")
      .build();

    List<BookDto> books = new ArrayList<>();
    books.add(book);

    return ResponseEntity.ok(books);
  }
}
