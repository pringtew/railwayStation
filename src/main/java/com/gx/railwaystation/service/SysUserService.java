package com.gx.railwaystation.service;

import com.gx.railwaystation.po.SysUser;
import com.gx.railwaystation.vo.MoneyVo;

public interface SysUserService {
    /**
     * 根据用户输入账号查询数据
     */
    SysUser userAccount(String account);

    /**
     * 注册用户
     */
    boolean register(SysUser user);

    /*
     *查询当前的登录信息
     */
    MoneyVo selectAllByUserId(Integer userId);

    /*
     *查询当前的登录的账户信息
     */
    SysUser selectUserById(Integer userId);

    /*
     *修改当前的用户信息
     */
    boolean updateUser(SysUser user);

    /**
     * 删除当前的用户信息
     */
    boolean deleteByUserId(Integer userId);

}
