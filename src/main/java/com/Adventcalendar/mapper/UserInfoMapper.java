package com.Adventcalendar.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.Adventcalendar.entity.UserInfo;

@Mapper
public interface UserInfoMapper {
    List<UserInfo> selectAll();
}