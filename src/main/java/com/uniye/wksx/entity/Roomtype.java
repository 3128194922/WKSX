package com.uniye.wksx.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YY
 * @since 2025-05-26
 */
@Getter
@Setter
@ToString
public class Roomtype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 是否带窗
     */
    private String window;

    /**
     * 是否可以抽烟
     */
    private String smoking;

    /**
     * 面积
     */
    private Double floorspace;

    /**
     * 图片
     */
    private String image;
}
