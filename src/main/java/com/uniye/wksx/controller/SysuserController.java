package com.uniye.wksx.controller;

import com.uniye.wksx.entity.Sysuser;
import com.uniye.wksx.service.ISysuserService;
import com.uniye.wksx.util.EasyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p >
 *
 * @author YY
 * @since 2025-05-26
 */
@RestController
@RequestMapping("/sysuser")
public class SysuserController {

    @Autowired
    ISysuserService sysuserService;
    @RequestMapping("list")
    public EasyResult getSysuser(){
        List<Sysuser> list=sysuserService.list();
        return EasyResult.success(list);
    }
    @PostMapping("/login")
    public EasyResult login(@RequestBody Sysuser sysuser) {
        Sysuser login = sysuserService.login(sysuser);
        if (login != null) {
            return EasyResult.success(login);
        } else {
            return EasyResult.error("登录失败");
        }
    }
}
