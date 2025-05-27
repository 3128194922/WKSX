package com.uniye.wksx.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 民宿id
     */
    private Integer homestayid;

    /**
     * 房间类型id
     */
    private Integer roomtypeid;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 房间图片
     */
    private String image;

    /**
     * 房间名称
     */
    private String name;

    /**
     * 所属用户
     */
    private Integer userid;

    private LocalDateTime createtime;
}
