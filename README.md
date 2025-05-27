SQL指令

-- 创建 sys_district 表   地区表
CREATE TABLE sysdistrict (
    id INT PRIMARY KEY comment '主键',
    name VARCHAR(255) comment '名称'
);

-- 创建 h_user 表   用户表
CREATE TABLE sysuser (
    id INT PRIMARY KEY  comment '主键',
    username VARCHAR(255) comment '用户名',
    password VARCHAR(255) comment '密码',
    nickname VARCHAR(255) comment '昵称',
    phone VARCHAR(11) comment '头像',
    gender VARCHAR(2) comment '性别',
    type INT comment '用户分类'
);

-- 创建 homestay 表   民宿
CREATE TABLE homestay (
    id INT  PRIMARY KEY  comment '主键',
    name VARCHAR(256) comment '名称',
    area VARCHAR(256) comment '区域',
    address VARCHAR(256) comment '地址',
    status INT comment '状态',
    tag VARCHAR(256) comment '标签',
    image VARCHAR(256) comment '图片',
    introduce VARCHAR(200) comment '介绍',
    userid INT comment '所属用户'
);

-- 创建 room_type 表  房间类型表
CREATE TABLE roomtype (
    id INT  PRIMARY KEY  comment '主键',
    name VARCHAR(256) comment '类型名称',
    `window` VARCHAR(256) comment '是否带窗',
    smoking VARCHAR(256) comment '是否可以抽烟',
    floorspace FLOAT comment '面积',
    image VARCHAR(256) comment '图片'
);

-- 创建 room 表   房间表
CREATE TABLE room (
    id INT  PRIMARY KEY  comment '主键',
    homestayid INT comment '民宿id',
    roomtypeid INT comment '房间类型id',
    price INT comment '价格',
    image varchar(200) comment '房间图片',
    name VARCHAR(256) comment '房间名称',
    userid INT comment '所属用户',
    createtime DATETIME
);

-- 创建 homestay_p_order 表
CREATE TABLE homestayorder (
    id INT  PRIMARY KEY  comment '主键',
    sn VARCHAR(256) comment '订单号',
    request VARCHAR(256) comment '需求说明',
    homestayid INT comment '民宿id',
    roomid int comment  '房间id',
    checkintime DATE comment '开始时间',
    checkouttime DATE comment '结束时间',
    phone VARCHAR(256) comment '联系方式',
    userid INT comment '用户id',
    createtime DATETIME comment '创建时间'
);
