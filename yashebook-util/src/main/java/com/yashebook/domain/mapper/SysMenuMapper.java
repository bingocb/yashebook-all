package com.yashebook.domain.mapper;

import com.yashebook.domain.po.SysMenu;
import com.yashebook.domain.po.SysMenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* SysMenuMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-11 11:49:49
*/
public interface SysMenuMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(SysMenuCriteria sysMenuCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(SysMenuCriteria sysMenuCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(SysMenu sysMenu);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysMenu sysMenu);

    /**
     * 根据条件查询记录集
     */
    List<SysMenu> selectByExample(SysMenuCriteria sysMenuCriteria);

    /**
     * 根据主键查询记录
     */
    SysMenu selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("sysMenu") SysMenu sysMenu, @Param("sysMenuCriteria") SysMenuCriteria sysMenuCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("sysMenu") SysMenu sysMenu, @Param("sysMenuCriteria") SysMenuCriteria sysMenuCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysMenu sysMenu);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysMenu sysMenu);
}