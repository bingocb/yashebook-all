package com.yashebook.domain.mapper;

import com.yashebook.domain.po.UserRank;
import com.yashebook.domain.po.UserRankCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* UserRankMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public interface UserRankMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(UserRankCriteria userRankCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(UserRankCriteria userRankCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(UserRank userRank);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(UserRank userRank);

    /**
     * 根据条件查询记录集
     */
    List<UserRank> selectByExample(UserRankCriteria userRankCriteria);

    /**
     * 根据主键查询记录
     */
    UserRank selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("userRank") UserRank userRank, @Param("userRankCriteria") UserRankCriteria userRankCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("userRank") UserRank userRank, @Param("userRankCriteria") UserRankCriteria userRankCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(UserRank userRank);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(UserRank userRank);
}