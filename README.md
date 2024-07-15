# 🐞使用WebMagic爬取知乎

- 爬取知乎热榜
- 爬取知乎话题列表，并获取高赞回答
- 使用github workflow自动触发任务

## 文档归档：
所有回答数据已全部归档再docs分支，请切换分支查看
地址: <https://github.com/zhaoweilong007/zhihuCrawler/tree/docs/document>

## 🔨项目环境

- JDK17
- gradle7.4.2

## 📄归档文件

**data文件夹下包含:**

- [archives](/data/archives):每日热榜数据，每天12点自动更新

- [json](/data/json):每日热榜json数据、回答json数据

- [topic](/data/topic):话题数据，话题关注人数大于两万

- [answer](/data/answer):各话题高赞回答，回答点赞数大于一万

项目结构如下:

```
├─.github
│  └─workflows
├─data
│  ├─answer
│  ├─archives
│  ├─json
│  └─topic
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─zwl
    │  │          ├─constant
    │  │          ├─listener
    │  │          ├─model
    │  │          ├─process
    │  │          └─util
    │  └─resources
    └─test
        ├─java
        │  └─com
        │      └─zwl
        │          └─test
        └─resources

```

**部分截图:**

- 热榜数据:

![](/data/img/zhihu1.png)

- 回答数据:

![](/data/img/zhihu2.png)

## 知乎API

### 获取知乎热榜

- 请求方式:GET
- 请求地址:https://www.zhihu.com/api/v3/feed/topstory/hot-lists/total?limit=50&desktop=true

### 获取知乎话题列表

- 请求方式: POST
- 请求地址: https://www.zhihu.com/node/TopicsPlazzaListV2
- form-data:

```
method=next&params={"topic_id":1761,"offset":20,"hash_id":""}
```

> ps: 话题爬取需要用到cookie，取cookie的值为`z_c0`

![](/data/img/zhihu3.png)

## Xpath语法

### 选取节点

|表达式|描述|
|----|----|
|nodename|    选取此节点的所有子节点。|
|/    |从根节点选取（取子节点）。|
|//    |从匹配选择的当前节点选择文档中的节点，而不考虑它们的位置（取子孙节点）。|
|.    |选取当前节点。|
|..    |选取当前节点的父节点。|
|@    |选取属性。|

### 路径表达式

|表达式|描述|
|----|----|
|bookstore    |选取 bookstore 元素的所有子节点。|
|/bookstore |选取根元素 bookstore|
|bookstore/book|    选取属于 bookstore 的子元素的所有 book 元素。|
|//book    |选取所有 book 子元素，而不管它们在文档中的位置。|
|bookstore//book|    选择属于 bookstore 元素的后代的所有 book 元素，而不管它们位于 bookstore 之下的什么位置。|
|//@lang    |选取名为 lang 的所有属性。|
