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
public class Sysuser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String phone;

    /**
     * 性别
     */
    private String gender;

    /**
     * 用户分类
     */
    private Integer type;
}
