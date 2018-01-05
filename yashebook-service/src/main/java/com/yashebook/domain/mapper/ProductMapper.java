package com.yashebook.domain.mapper;

import com.yashebook.domain.po.Product;
import com.yashebook.domain.po.ProductCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* ProductMapper
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public interface ProductMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(ProductCriteria productCriteria);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(ProductCriteria productCriteria);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Product product);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Product product);

    /**
     * 根据条件查询记录集
     */
    List<Product> selectByExample(ProductCriteria productCriteria);

    /**
     * 根据主键查询记录
     */
    Product selectByPrimaryKey(Long id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("product") Product product, @Param("productCriteria") ProductCriteria productCriteria);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("product") Product product, @Param("productCriteria") ProductCriteria productCriteria);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Product product);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Product product);
}