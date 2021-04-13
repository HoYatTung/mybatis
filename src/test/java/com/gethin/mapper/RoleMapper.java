package com.gethin.mapper;

import com.gethin.po.Role;

/**
 * @author heridong
 * @create 2021/4/13 10:37
 */
public interface RoleMapper {
    public Role getRole(Long id);
    public Role findRole(String roleName);
    public int deleteRole(Long id);
    public int insertRole(Role role);
}
