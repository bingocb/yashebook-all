package com.yashebook.domain.mapper;

import com.yashebook.domain.po.SysUserRoles;
import com.yashebook.domain.po.SysUserRolesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* SysUserRolesMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-11 15:07:42
*/
public interface SysUserRolesMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SysUserRolesCriteria sysUserRolesCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SysUserRolesCriteria sysUserRolesCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(SysUserRoles sysUserRoles);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysUserRoles sysUserRoles);

    /**
     * 根据条件查询记录集
     */
    List<SysUserRoles> selectByExample(SysUserRolesCriteria sysUserRolesCriteria);

    /**
     * 根据主键查询记录
     */
    SysUserRoles selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("sysUserRoles") SysUserRoles sysUserRoles, @Param("sysUserRolesCriteria") SysUserRolesCriteria sysUserRolesCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("sysUserRoles") SysUserRoles sysUserRoles, @Param("sysUserRolesCriteria") SysUserRolesCriteria sysUserRolesCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysUserRoles sysUserRoles);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysUserRoles sysUserRoles);
}