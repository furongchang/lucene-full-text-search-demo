# lucene-full-text-search-demo
lucene-full-text-search-demo
#### 介绍：
全文检索的流程：索引流程、搜索流程
索引流程：采集数据文档处理存储到索引库中
搜索流程：输入查询条件通过lucene的查询器查询索引从索引库中取出结果。
	创建索引的API:
1.	Document（文档类）
Document：文档对象，是一条原始的数据。
2.	Field（字段类）
一个Document中可以有很多个不同的字段，每一个字段都是一个Field类的对象。一个Document中的字段其类型是不确定的，因此Field类就提供了各种不同的子类，来对应这些不同类型的字段。
3.	Directory（目录类）
指定索引要存储的位置。
4.	Analyzer（分词器类）
提供分词算法，可以把文档中的数据按照算法分词。
5. IndexWriter（索引写出器类）
索引写出工具，作用就是 实现对索引的增（创建索引）、删（删除索引）、改(修改索引)。
#### 运行环境：
Java版本 Java jdk1.8
apache.lucene 7.2.1 (使用了最新版本而不是5.0，能够更好的创建索引)
struts 2.5 
mysql 8.0 （源文件为txt文件，未使用数据库存储数据）
tomcat 8.0
#### 软件架构：
 
#### 使用说明：
1.	下载解压后配置tomcat
2.	将源文件hello.txt放到与源码匹配的位置
3.	运行在网页中检索
#### 参与贡献：
1.	Fork 本仓库
2.	新建 Feat分支
3.	提交代码
4.	新建 Pull Request
#### 作者：付荣畅
#### 源码：
1.	你可以点击 https://gitee.com/fu-rongchang/lucene-full-text-search-demo.git 这个地址来了解 Gitee 上对应的开源项目
2.	你可以点击 https://github.com/furongchang/lucene-full-text-search-demo.git 这个地址来了解 Github 上对应的开源项目

#### 对系统的构想:
在当今信息爆炸的时代，每个单位或个人都在为信息的快速增长做出了各种贡献。信息的种类也在不断的扩展，越来越多的非结构化信息不断出现，包括企业的各种报表、帐单、电子文档、网站的各种元素、图片、传真、扫描影像，以及大量的多媒体的音频、视频信息等等。所有的存储数据中，85%采用的是非结构化格式的，非结构化信息每三个月增长一倍。由于信息格式的差异很大，所以基本无法整合为统一的接口供政府工作人员或广大群众方便使用。
全文检索是计算机程序通过扫描文章中的每一个词，对每一个词建立一个索引，指明该词在文章中出现的次数和位置，当用户查询时根据建立的索引查找，类似于通过字典的检索字表查字的过程。
全文检索系统有许多的特点，强大的信息采集能力，能够采集多种动态和静态网页类型、多种文档、数据库类型，同时网页实时增量采集技术实现分秒监测网站信息变化动态，使网站随时获取最新的信息资源。分秒级的实时检索，全文检索系统采用独有的增量实时索引技术保证信息即时采集即时检索，使用户随时检索到行业地区最新的信息。快速的检索响应，全文检索系统可实现亚秒级的检索速度以及每秒上百次的并发检索支持，保证全面快速的响应用户检索需求。同时还具有精确的检索结果，丰富的结果展示的优秀特点。
全文检索系统能够应用的场景有很多, 使用全文检索技术可以实现搜索引擎（百度、google…），搜索引擎可以搜索互联网上所有的内容（网页、pdf电子书、视频、音乐）。使用全文检索技术可以实现站内搜索，站内搜索只能搜索本网站的信息（网页、pdf电子书、视频、音乐、关系数据库中的信息等等），比如：电商网站搜索商品信息，论坛网站搜索网内帖子。查准率和查全率是较为常用的引用场景,建库方式和索引词典,数据结构及字段类型的限制,检索灵活方便的程度与网络功能和Internet信息发布，总之全文检索可以在信息行业文献检索和网络数据库检索系统中得到良好应用。
