package com.yashebook.domain.mapper;

import com.yashebook.domain.po.BookAttributes;
import com.yashebook.domain.po.BookAttributesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* BookAttributesMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public interface BookAttributesMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(BookAttributesCriteria bookAttributesCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(BookAttributesCriteria bookAttributesCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(BookAttributes bookAttributes);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(BookAttributes bookAttributes);

    /**
     * 根据条件查询记录集
     */
    List<BookAttributes> selectByExample(BookAttributesCriteria bookAttributesCriteria);

    /**
     * 根据主键查询记录
     */
    BookAttributes selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("bookAttributes") BookAttributes bookAttributes, @Param("bookAttributesCriteria") BookAttributesCriteria bookAttributesCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("bookAttributes") BookAttributes bookAttributes, @Param("bookAttributesCriteria") BookAttributesCriteria bookAttributesCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(BookAttributes bookAttributes);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(BookAttributes bookAttributes);
}