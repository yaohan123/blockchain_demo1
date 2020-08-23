package com.yaohan.postlike.mapper;

import com.yaohan.postlike.domain.UserLike;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserLikeMapper {

    UserLike selectUserLikeById(@Param("id") Integer id);


}
