create database if not exists `crawler` charset utf8mb4 collate utf8mb4_unicode_ci;


use crawler;


-- auto-generated definition
create table if not exists answer
(
    id             bigint auto_increment comment '主键'
        primary key,
    topic_id       bigint       null comment '话题id',
    question_id    bigint       null comment '问题id',
    question_title varchar(255) null comment '问题标题',
    answer_id      bigint       null comment '回答id',
    author_id      varchar(50)  null comment '作者id',
    author_name    varchar(100) null comment '作者名称',
    avatar_url     varchar(255) null comment '作者头像',
    headline       varchar(255) null comment '用户标题',
    voteup_count   bigint       null comment '回答点赞数',
    comment_count  bigint       null comment '回答评论数',
    content        longtext     null comment '回答内容',
    pictures       json         null comment '图片数据，json格式，key为图片名称，value为图片base64',
    word_num       bigint       null comment '字数',
    picture_num    bigint       null comment '图片数量',
    created_time   timestamp    null comment '回答创建时间',
    updated_time   timestamp    null comment '回答更新时间',
    answer_url     varchar(255) null comment '回答地址',
    type           varchar(10)  null comment '回答类型 '
)
    comment '回答表' charset = utf8mb4
                     collate utf8mb4_unicode_ci;

-- auto-generated definition
create table if not exists topic
(
    id         bigint auto_increment comment '主键'
        primary key,
    topic_id   bigint           null comment '话题id',
    parent_id  bigint           null comment '父话题id',
    topic_name varchar(100)     null comment '话题名称',
    followers  bigint default 0 null comment '关注人数'
)
    comment '话题表' charset = utf8mb4
                     collate utf8mb4_unicode_ci;

