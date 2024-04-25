package com.texas.csitthird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book-model")


public class CsitThirdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsitThirdApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Hello From Csit Third";
	}
	@GetMapping("/first")
	public String getMyFirstApi(@RequestParam(value = "text", defaultValue ="spring boot" ) String text){
		return "Hello From " + text;
	}
	List<BookModel> bookList = new ArrayList<>(Arrays.asList(new BookModel(1, "KEC MATH II", 500.75), new BookModel(2, "KEC STATISTICS I", 450.25)));

	@GetMapping("/{id}")
	public BookModel getById(@PathVariable Integer id) {
		for (BookModel book : bookList) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	@GetMapping
	public List<BookModel> getAll() {
		return bookList;
	}

	@PostMapping
	public List<BookModel> save(@RequestBody BookModel book) {
		bookList.add(book);
		return bookList;
	}

	@PutMapping
	public List<BookModel> update(@RequestBody BookModel book) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getId() == book.getId()) {
				bookList.set(i, book);
			}
		}
		return bookList;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		for (BookModel book : bookList) {
			if (book.getId() == id) {
				bookList.remove(book);
				return;
			}
		}
	}
}
