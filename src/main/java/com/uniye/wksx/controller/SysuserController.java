package com.uniye.wksx.controller;

import com.uniye.wksx.entity.Sysuser;
import com.uniye.wksx.service.ISysuserService;
import com.uniye.wksx.util.EasyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/login")
    public EasyResult login(Sysuser sysuser){
        Sysuser loginuser=sysuserService.login(sysuser);
        if (loginuser!=null){
            return EasyResult.success(loginuser);
        }else {
            return EasyResult.error("登录失败");
        }
    }

    @PostMapping("/add")
    public EasyResult addUser(@RequestBody Sysuser sysuser) {
        boolean result = sysuserService.save(sysuser);
        return result ? EasyResult.success() : EasyResult.error("添加用户失败");
    }

    @DeleteMapping("/delete/{id}")
    public EasyResult deleteUser(@PathVariable Integer id) {
        boolean result = sysuserService.removeById(id);
        return result ? EasyResult.success() : EasyResult.error("删除用户失败");
    }

    @PutMapping("/update")
    public EasyResult updateUser(@RequestBody Sysuser sysuser) {
        boolean result = sysuserService.updateById(sysuser);
        return result ? EasyResult.success() : EasyResult.error("更新用户失败");
    }

}