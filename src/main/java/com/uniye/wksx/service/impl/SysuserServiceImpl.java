package com.uniye.wksx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.uniye.wksx.entity.Sysuser;
import com.uniye.wksx.mapper.SysuserMapper;
import com.uniye.wksx.service.ISysuserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YY
 * @since 2025-05-26
 */
@Service
public class SysuserServiceImpl extends ServiceImpl<SysuserMapper, Sysuser> implements ISysuserService {
    @Override
    public Sysuser login(Sysuser sysuser) {
        // 校验数据库中是否有对应的账号
        QueryWrapper<Sysuser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", sysuser.getUsername());
        Sysuser result = this.getOne(wrapper);

        // 如果用户存在且密码匹配
        if (result != null && result.getPassword().equals(sysuser.getPassword())) {
            return result; // 登录成功返回用户信息
        }

        return null; // 登录失败返回null
    }
}
