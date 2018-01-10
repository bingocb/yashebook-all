package com.yashebook.domain.mapper;

import com.yashebook.domain.po.BookCats;
import com.yashebook.domain.po.BookCatsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* BookCatsMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public interface BookCatsMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(BookCatsCriteria bookCatsCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(BookCatsCriteria bookCatsCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(BookCats bookCats);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(BookCats bookCats);

    /**
     * 根据条件查询记录集
     */
    List<BookCats> selectByExample(BookCatsCriteria bookCatsCriteria);

    /**
     * 根据主键查询记录
     */
    BookCats selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("bookCats") BookCats bookCats, @Param("bookCatsCriteria") BookCatsCriteria bookCatsCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("bookCats") BookCats bookCats, @Param("bookCatsCriteria") BookCatsCriteria bookCatsCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(BookCats bookCats);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(BookCats bookCats);
}