package com.uniye.wksx.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
public class Homestayorder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单号
     */
    private String sn;

    /**
     * 需求说明
     */
    private String request;

    /**
     * 民宿id
     */
    private Integer homestayid;

    /**
     * 房间id
     */
    private Integer roomid;

    /**
     * 开始时间
     */
    private LocalDate checkintime;

    /**
     * 结束时间
     */
    private LocalDate checkouttime;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;
}
