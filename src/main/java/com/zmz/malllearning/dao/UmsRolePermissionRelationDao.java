package com.zmz.malllearning.dao;

import com.zmz.malllearning.mbg.model.UmsPermission;
import com.zmz.malllearning.mbg.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户角色管理自定义Dao
 * Created by zmz on 2019/11/19.
 */
public interface UmsRolePermissionRelationDao {

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);

    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list")List<UmsRolePermissionRelation> list);
}
