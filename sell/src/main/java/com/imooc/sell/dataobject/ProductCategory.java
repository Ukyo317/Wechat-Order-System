package com.imooc.sell.dataobject;

/**
 * 类目
 * 如果这里的类名和MQL里的表名不一致，需要在类名前面加上@Table
 * e.g. assume 表名: s_product_category
 *
 * @Table(name = "s_product_category")
 * 这里类名和表名不一致，jpa已经帮我们做好了
 */

//import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 将数据库映射成对象需要加一些注解 */
@Entity
public class ProductCategory {

    /** 类目Id */
    @Id // 组件
    @GeneratedValue
    private Integer categoryId;  // main key

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
}
