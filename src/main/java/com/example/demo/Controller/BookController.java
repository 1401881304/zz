package com.example.demo.Controller;

import com.example.demo.Pojo.Book;
import com.example.demo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/bookOps")
    public void bookOps(){
        Book b1=new Book();
        b1.setName("西厢记");
        b1.setAuthor("王实铺");
       // int i=bookService.addBook(b1);
    //    System.out.println("addBook>>>"+i);
        Book b2=new Book();
        b2.setId(1);
        b2.setName("朝花夕拾1");
        b2.setAuthor("鲁迅1");
        int updateBook=bookService.updateBook(b2);
        System.out.println("updateBook>>>"+updateBook);
        Book b3=bookService.getBookById(1);
        System.out.println("getBookById>>>"+b3.getName()+","+b3.getAuthor());
        int delete=bookService.deleteBookById(2);
        System.out.println("deleteBookById>>>"+delete);
        List<Book>allBooks=bookService.getAllBooks();
        System.out.println("getAllBooks"+allBooks);

    }
}
