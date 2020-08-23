create table `like_count`(
    `id` int not null auto_increment,
    `video_id` varchar(32) not null comment '视频id',
    `count` int not null default '0' comment '点赞数量',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key(`id`)
) comment '点赞数量表';