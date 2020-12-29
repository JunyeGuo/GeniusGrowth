package com.workflow.project.dao;

import com.workflow.project.entity.Role;

public interface RoleDao {
    int deleteByPrimaryKey(Long rid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}