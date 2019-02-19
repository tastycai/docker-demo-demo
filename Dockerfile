FROM zookeeper
MAINTAINER tastycai tastycai@github.com

# 拷贝jar文件到镜像中
COPY target/demo-0.0.1-SNAPSHOT.jar /tmp

#容器启动时执行命令
CMD java -jar /tmp/demo-0.0.1-SNAPSHOT.jar

#暴露端口
EXPOSE 8000
