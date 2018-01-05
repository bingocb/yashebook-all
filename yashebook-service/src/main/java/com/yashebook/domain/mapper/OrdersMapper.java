package com.yashebook.domain.mapper;

import com.yashebook.domain.po.Orders;
import com.yashebook.domain.po.OrdersCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* OrdersMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public interface OrdersMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(OrdersCriteria ordersCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(OrdersCriteria ordersCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Orders orders);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Orders orders);

    /**
     * 根据条件查询记录集
     */
    List<Orders> selectByExample(OrdersCriteria ordersCriteria);

    /**
     * 根据主键查询记录
     */
    Orders selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("orders") Orders orders, @Param("ordersCriteria") OrdersCriteria ordersCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("orders") Orders orders, @Param("ordersCriteria") OrdersCriteria ordersCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Orders orders);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Orders orders);
}