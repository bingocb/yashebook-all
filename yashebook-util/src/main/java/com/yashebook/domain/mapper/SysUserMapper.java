package com.yashebook.domain.mapper;

import com.yashebook.domain.po.SysUser;
import com.yashebook.domain.po.SysUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* SysUserMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-11 11:49:49
*/
public interface SysUserMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SysUserCriteria sysUserCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SysUserCriteria sysUserCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(SysUser sysUser);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysUser sysUser);

    /**
     * 根据条件查询记录集
     */
    List<SysUser> selectByExample(SysUserCriteria sysUserCriteria);

    /**
     * 根据主键查询记录
     */
    SysUser selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("sysUser") SysUser sysUser, @Param("sysUserCriteria") SysUserCriteria sysUserCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("sysUser") SysUser sysUser, @Param("sysUserCriteria") SysUserCriteria sysUserCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysUser sysUser);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysUser sysUser);
}