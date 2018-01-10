package com.yashebook.domain.mapper;

import com.yashebook.domain.po.Areas;
import com.yashebook.domain.po.AreasCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* AreasMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public interface AreasMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(AreasCriteria areasCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(AreasCriteria areasCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Areas areas);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Areas areas);

    /**
     * 根据条件查询记录集
     */
    List<Areas> selectByExample(AreasCriteria areasCriteria);

    /**
     * 根据主键查询记录
     */
    Areas selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("areas") Areas areas, @Param("areasCriteria") AreasCriteria areasCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("areas") Areas areas, @Param("areasCriteria") AreasCriteria areasCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Areas areas);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Areas areas);
}