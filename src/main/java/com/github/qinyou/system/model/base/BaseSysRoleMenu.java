package com.github.qinyou.system.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

import java.util.Date;

/**
 * Generated baseModel
 * DB table: sys_role_menu  角色菜单中间表
 *
 * @author zhangchuang
 * @since 2019-02-21 13:10:49
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysRoleMenu<M extends BaseSysRoleMenu<M>> extends Model<M> implements IBean {


    // 角色id
    public String getSysRoleId() {
        return getStr("sysRoleId");
    }

    public M setSysRoleId(String sysRoleId) {
        set("sysRoleId", sysRoleId);
        return (M) this;
    }


    // 菜单id
    public String getSysMenuId() {
        return getStr("sysMenuId");
    }

    public M setSysMenuId(String sysMenuId) {
        set("sysMenuId", sysMenuId);
        return (M) this;
    }


    // 创建人
    public String getCreater() {
        return getStr("creater");
    }

    public M setCreater(String creater) {
        set("creater", creater);
        return (M) this;
    }


    // 创建时间
    public Date getCreateTime() {
        return get("createTime");
    }

    public M setCreateTime(Date createTime) {
        set("createTime", createTime);
        return (M) this;
    }
}
