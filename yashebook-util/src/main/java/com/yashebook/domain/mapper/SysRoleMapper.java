package com.yashebook.domain.mapper;

import com.yashebook.domain.po.SysRole;
import com.yashebook.domain.po.SysRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* SysRoleMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-11 11:49:49
*/
public interface SysRoleMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SysRoleCriteria sysRoleCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SysRoleCriteria sysRoleCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(SysRole sysRole);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysRole sysRole);

    /**
     * 根据条件查询记录集
     */
    List<SysRole> selectByExample(SysRoleCriteria sysRoleCriteria);

    /**
     * 根据主键查询记录
     */
    SysRole selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("sysRole") SysRole sysRole, @Param("sysRoleCriteria") SysRoleCriteria sysRoleCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("sysRole") SysRole sysRole, @Param("sysRoleCriteria") SysRoleCriteria sysRoleCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysRole sysRole);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysRole sysRole);
}