package com.yashebook.domain.mapper;

import com.yashebook.domain.po.Express;
import com.yashebook.domain.po.ExpressCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* ExpressMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public interface ExpressMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(ExpressCriteria expressCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(ExpressCriteria expressCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Express express);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Express express);

    /**
     * 根据条件查询记录集
     */
    List<Express> selectByExample(ExpressCriteria expressCriteria);

    /**
     * 根据主键查询记录
     */
    Express selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("express") Express express, @Param("expressCriteria") ExpressCriteria expressCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("express") Express express, @Param("expressCriteria") ExpressCriteria expressCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Express express);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Express express);
}