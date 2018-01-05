package com.yashebook.domain.mapper;

import com.yashebook.domain.po.Book;
import com.yashebook.domain.po.BookCriteria;
import com.yashebook.domain.po.BookWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* BookMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public interface BookMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(BookCriteria bookCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(BookCriteria bookCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(BookWithBLOBs bookWithBLOBs);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(BookWithBLOBs bookWithBLOBs);

    /**
     * 根据条件查询记录集
     */
    List<BookWithBLOBs> selectByExampleWithBLOBs(BookCriteria bookCriteria);

    /**
     * 根据条件查询记录集
     */
    List<Book> selectByExample(BookCriteria bookCriteria);

    /**
     * 根据主键查询记录
     */
    BookWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("bookWithBLOBs") BookWithBLOBs bookWithBLOBs, @Param("bookCriteria") BookCriteria bookCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExampleWithBLOBs(@Param("bookWithBLOBs") BookWithBLOBs bookWithBLOBs, @Param("bookCriteria") BookCriteria bookCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("book") Book book, @Param("bookCriteria") BookCriteria bookCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(BookWithBLOBs bookWithBLOBs);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(BookWithBLOBs bookWithBLOBs);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Book book);
}