package com.yashebook.domain.mapper;

import com.yashebook.domain.po.Follows;
import com.yashebook.domain.po.FollowsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* FollowsMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public interface FollowsMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(FollowsCriteria followsCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(FollowsCriteria followsCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Follows follows);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Follows follows);

    /**
     * 根据条件查询记录集
     */
    List<Follows> selectByExample(FollowsCriteria followsCriteria);

    /**
     * 根据主键查询记录
     */
    Follows selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("follows") Follows follows, @Param("followsCriteria") FollowsCriteria followsCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("follows") Follows follows, @Param("followsCriteria") FollowsCriteria followsCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Follows follows);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Follows follows);
}