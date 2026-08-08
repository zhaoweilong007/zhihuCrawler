

# 🐞Crawl Zhihu Using WebMagic

- Crawl Zhihu Hot List
- Crawl Zhihu topic lists and fetch highly upvoted answers
- Automatically trigger tasks using GitHub workflows

## Documentation Archive:
All answer data has been archived in the `docs` branch. Please switch to that branch to view it.
URL: <https://github.com/zhaoweilong007/zhihuCrawler/tree/docs/document>

## 🔨Project Environment

- JDK17
- gradle7.4.2

## 📄Archived Files

**The `data` folder contains:**

- [archives](/data/archives): Daily hot list data, automatically updated at 12:00 PM daily

- [json](/data/json): Daily hot list JSON data and answer JSON data

- [topic](/data/topic): Topic data, for topics with over 20,000 followers

- [answer](/data/answer): Highly upvoted answers for various topics, with over 10,000 upvotes per answer

The project structure is as follows:

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

**Sample Screenshots:**

- Hot List Data:

![](/data/img/zhihu1.png)

- Answer Data:

![](/data/img/zhihu2.png)

## Zhihu API

### Fetch Zhihu Hot List

- Request Method: GET
- Endpoint: https://www.zhihu.com/api/v3/feed/topstory/hot-lists/total?limit=50&desktop=true

### Fetch Zhihu Topic List

- Request Method: POST
- Endpoint: https://www.zhihu.com/node/TopicsPlazzaListV2
- Form Data:

```
method=next&params={"topic_id":1761,"offset":20,"hash_id":""}
```

> Note: Crawling topics requires a cookie. Please use the value of `z_c0`.

![](/data/img/zhihu3.png)

## XPath Syntax

### Selecting Nodes

|Expression|Description|
|----|----|
|nodename|    Selects all child nodes of this node.|
|/    |Selects from the root node (child nodes).|
|//    |Selects nodes in the document from the current matched node, regardless of their location (descendant nodes).|
|.    |Selects the current node.|
|..    |Selects the parent node of the current node.|
|@    |Selects attributes.|

### Path Expressions

|Expression|Description|
|----|----|
|bookstore    |Selects all child nodes of the `bookstore` element.|
|/bookstore |Selects the root element `bookstore`|
|bookstore/book|    Selects all `book` elements that are children of the `bookstore` element.|
|//book    |Selects all `book` descendants, regardless of their position in the document.|
|bookstore//book|    Selects all `book` descendants of the `bookstore` element, regardless of where they are located under `bookstore`.|
|//@lang    |Selects all attributes named `lang`.|
