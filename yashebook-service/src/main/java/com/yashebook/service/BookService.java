package com.yashebook.service;

import com.alibaba.fastjson.JSON;
import com.yashebook.bo.Success;
import com.yashebook.domain.mapper.BookMapper;
import com.yashebook.domain.mapper.BookTypeMapper;
import com.yashebook.domain.po.Book;
import com.yashebook.domain.po.BookCriteria;
import com.yashebook.domain.po.BookType;
import com.yashebook.domain.po.BookTypeCriteria;
import com.yashebook.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by binchen on 2018/1/3.
 */
@Service
public class BookService {
    
    private String success = "success";

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookTypeMapper bookTypeMapper;


    public String bookTypeList(){
        BookTypeCriteria criteria = new BookTypeCriteria();
        criteria.createCriteria();
        List<BookType> types = bookTypeMapper.selectByExample(criteria);
        return new Success(true, types).toString();
    }

    public String addBookType(String json) {
        List<BookType> types = JSON.parseObject(json, ArrayList.class);
        for (BookType type : types) {
            type.setTypeSn(UUID.get());
            bookTypeMapper.insertSelective(type);
        }
        return new Success(true).toString();
    }

    public String updBookType(String json){
        BookType type = JSON.parseObject(json, BookType.class);
        bookTypeMapper.updateByPrimaryKeySelective(type);
        return new Success(true).toString();
    }

    public String delBookType(String json) {

        bookTypeMapper.deleteByPrimaryKey(Long.valueOf(json));
        return new Success(true).toString();
    }

    public String bookList(){
        BookCriteria criteria = new BookCriteria();
        criteria.createCriteria();
        List<Book> books = bookMapper.selectByExample(criteria);
        return new Success(true, books).toString();
    }

    public String addBook(String json) {
        List<Book> books = JSON.parseObject(json, ArrayList.class);
        for (Book book : books) {
            book.setBookSn(UUID.get());
            book.setCreateTime(new Date());
            book.setModifyTime(new Date());
            bookMapper.insertSelective(book);
        }
        return new Success(true).toString();
    }
    
    public String updBook(String json) {
        Book book = JSON.parseObject(json, Book.class);
        book.setModifyTime(new Date());
        bookMapper.updateByPrimaryKeySelective(book);
        return new Success(true).toString();
    }
    
    public String delBook(String json) {
        bookMapper.deleteByPrimaryKey(Long.valueOf(json));
        return new Success(true).toString();
    }
}
