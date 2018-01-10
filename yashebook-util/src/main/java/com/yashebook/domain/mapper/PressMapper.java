package com.yashebook.domain.mapper;

import com.yashebook.domain.po.Press;
import com.yashebook.domain.po.PressCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* PressMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public interface PressMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(PressCriteria pressCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(PressCriteria pressCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Press press);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Press press);

    /**
     * 根据条件查询记录集
     */
    List<Press> selectByExample(PressCriteria pressCriteria);

    /**
     * 根据主键查询记录
     */
    Press selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("press") Press press, @Param("pressCriteria") PressCriteria pressCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("press") Press press, @Param("pressCriteria") PressCriteria pressCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Press press);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Press press);
}