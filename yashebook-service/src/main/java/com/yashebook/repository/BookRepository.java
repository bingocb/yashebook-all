package com.yashebook.repository;

import com.yashebook.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by binchen on 2017/12/26.
 */
public abstract class BookRepository implements JpaRepository<Book, Long>{
}
