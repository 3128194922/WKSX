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
 * @author WKX
 * @since 2025-05-26
 */
@Getter
@Setter
@ToString
public class Homestay implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 区域
     */
    private String area;

    /**
     * 地址
     */
    private String address;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 标签
     */
    private String tag;

    /**
     * 图片
     */
    private String image;

    /**
     * 介绍
     */
    private String introduce;

    /**
     * 所属用户
     */
    private Integer userid;
}
