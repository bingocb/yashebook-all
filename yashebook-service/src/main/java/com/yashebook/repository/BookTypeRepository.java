package com.yashebook.repository;

import com.yashebook.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by binchen on 2017/12/26.
 */
public abstract class BookTypeRepository implements JpaRepository<BookType, Long>{
}
