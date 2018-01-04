package com.yashebook.service;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;


/**
 * Created by binchen on 2018/1/3.
 */
@Service
public class BookService {

    /*private BookRepository bookRepository() {
        return SpringUtils.getBean(BookRepository.class);
    }

    public String list() {
        List<Book> list =  bookRepository().findAll();
        Map<String, Object> map = new HashMap<>();
        map.put("book_list", list);
        return JSON.toJSONString(map);
    }*/
}
