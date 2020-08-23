package com.yaohan.postlike.domain;

import com.yaohan.postlike.constant.LikedStatusEnum;
import com.sun.jmx.snmp.Timestamp;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

/**
 * 用户点赞表
 */
@Entity
@Data
public class UserLike {

    //主键id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //被点赞的用户的id
    private String likedUserId;

    //点赞的用户的id
    private String likedPostId;

    //点赞的状态.默认未点赞
    private Integer status = LikedStatusEnum.UNLIKE.getCode();

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;

    public UserLike() {
    }

    public UserLike(String likedUserId, String likedPostId, Integer status) {
        this.likedUserId = likedUserId;
        this.likedPostId = likedPostId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLikedUserId() {
        return likedUserId;
    }

    public void setLikedUserId(String likedUserId) {
        this.likedUserId = likedUserId;
    }

    public String getLikedPostId() {
        return likedPostId;
    }

    public void setLikedPostId(String likedPostId) {
        this.likedPostId = likedPostId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserLike{" +
                "id=" + id +
                ", likedUserId='" + likedUserId + '\'' +
                ", likedPostId='" + likedPostId + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}