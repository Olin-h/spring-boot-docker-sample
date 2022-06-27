# Docker image for springboot application
# VERSION 0.0.1
# Author: olinh

### 基础镜像，openjkd使用8u332-jdk
FROM openjdk:8u332-jdk

# 作者
MAINTAINER olinh <olinone666@gmail.com>

# 声明一个挂载点，容器内此路径会对应宿主机的某个文件夹
VOLUME /tmp

# 应用构建成功后的jar文件被复制到镜像内，名字也改成了boot-docker-app.jar
ADD target/spring-boot-docker-sample-0.0.1.jar boot-docker-app.jar

# 启动容器时的进程
ENTRYPOINT ["java","-jar","/boot-docker-app.jar"]

# 暴露8001端口
EXPOSE 8001
