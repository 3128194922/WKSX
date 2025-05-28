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
@CrossOrigin
@RestController
@RequestMapping("/sysuser")
public class SysuserController {

    @Autowired
    ISysuserService sysuserService;
    @RequestMapping("list")
    public EasyResult getSysuser() {
        List<Sysuser> list = sysuserService.list();
        return EasyResult.success(list);
    }
    @RequestMapping("login")
    public EasyResult login(Sysuser sysuser) {
        Sysuser loginuser = sysuserService.login(sysuser);
        if (loginuser != null) {
            return EasyResult.success(loginuser);
        } else {
            return EasyResult.error("登录失败");
        }
    }
    @RequestMapping("add")
    public EasyResult add(@RequestBody Sysuser sysuser) {
        sysuserService.save(sysuser);
        return EasyResult.success();
    }
    @RequestMapping("delete/{id}")
    public EasyResult delete(@PathVariable int id){
        sysuserService.removeById(id);
        return EasyResult.success();
    }
    @RequestMapping("edit")
    public EasyResult update(@RequestBody Sysuser sysuser){
        sysuserService.updateById(sysuser);
        return EasyResult.success();
    }
}
