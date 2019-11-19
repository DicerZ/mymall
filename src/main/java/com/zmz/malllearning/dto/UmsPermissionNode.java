package com.zmz.malllearning.dto;

import com.zmz.malllearning.mbg.model.UmsPermission;

import java.util.List;

/**
 * Created by zmz on 2019/11/19.
 */
public class UmsPermissionNode extends UmsPermission {
    private List<UmsPermissionNode> children;

    public List<UmsPermissionNode> getChildren() {
        return children;
    }

    public void setChildren(List<UmsPermissionNode> children) {
        this.children = children;
    }
}
