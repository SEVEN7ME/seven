# Docker中ELK服务搭建
项目日志收集默认logback收集打包亚索,同样可以通过修改配置文件后采用Logstash日志收集.

```yaml
# 日志收集
seven:
  log:
    handler: logstash # 指定日志收集处理方式: console和logstash  不配置默认console
    host: farm-logstash # logstash日志收集地址,开启logstash日志收集有效
    port: 9601 # logstash日志收集端口,开启logstash日志收集有效
    level: INFO # 日志收集级别
```

## ELK概述

ELK是三个开源软件的缩写，分别表示：Elasticsearch , Logstash, Kibana , 它们都是开源软件。新增了一个FileBeat，它是一个轻量级的日志收集处理工具(Agent)，Filebeat占用资源少，适合于在各个服务器上搜集日志后传输给Logstash，官方也推荐此工具。

## 准备镜像
从6.0版本之后官方就自己维护镜像仓库：[https://www.docker.elastic.co][1]，当然还可以从docker官方仓库拉取：[https://hub.docker.com][2]。官方pull下来的镜像名称太长，可以用tag重新命名一下。
```bash
# 从docker.io拉取镜像
docker pull elasticsearch:6.5.4
docker pull logstash:6.5.4
docker pull kibana:6.5.4

# 从docker.elastic.co拉取镜像
docker pull docker.elastic.co/elasticsearch/elasticsearch:6.5.4
docker pull docker.elastic.co/logstash/logstash:6.5.4
docker pull docker.elastic.co/kibana/kibana:6.5.4
```


  [1]: https://www.docker.elastic.co/
  [2]: https://hub.docker.com
  [3]: http://static.zybuluo.com/SevenMe/r8rina9vqgt20kucfn9usicb/image_1cvuas6v98g9t2q1qjmq94hfo9.png