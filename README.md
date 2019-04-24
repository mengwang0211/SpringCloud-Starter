### SpringCloud微服务架构 简单脚手架

#### SpringCloud微服务结构介绍

	 
Spring Cloud provides tools for developers to quickly build some of the common patterns in distributed systems (e.g. configuration management, service discovery, circuit breakers, intelligent routing, micro-proxy, control bus, one-time tokens, global locks, leadership election, distributed sessions, cluster state). Coordination of distributed systems leads to boiler plate patterns, and using Spring Cloud developers can quickly stand up services and applications that implement those patterns. They will work well in any distributed environment, including the developer's own laptop, bare metal data centres, and managed platforms such as Cloud Foundry.
	
	
#### 中文版介绍

Spring Cloud为开发人员提供了快速构建分布式系统中一些常见模式的工具（例如配置管理，服务发现，断路器，智能路由，微代理，控制总线）。分布式系统的协调导致了样板模式, 使用Spring Cloud开发人员可以快速地支持实现这些模式的服务和应用程序。他们将在任何分布式环境中运行良好，包括开发人员自己的笔记本电脑，裸机数据中心，以及Cloud Foundry等托管平台。

#### 相关文档介绍

[SpringCloud中文文档](https://springcloud.cc/spring-cloud-dalston.html)

[SpringCloud英文文档](https://projects.spring.io/spring-cloud/)


#### 项目技术栈

```

SpringBoot 2.0.4
SpringCloud Finchley.RELEASE
SpringCloud Gateway
nacos 
...



```


#### 开发环境准备

```

【必选配置】
64 bit JDK 1.8+；
Maven 3.2.x+；

【可选配置】
docker
docker-compose

```

1. 安装完JDK和Maven后...
2. 安装服务注册中心[Nacos](https://nacos.io/zh-cn/docs)

    2.1 安装nacos
    你可以通过源码和发行包两种方式来获取 Nacos。
        2.1.1 下载源码方式
        ```
            git clone https://github.com/alibaba/nacos.git
            cd nacos/
            mvn -Prelease-nacos clean install -U  
            ls -al distribution/target/
            
            // change the $version to your actual path
            cd distribution/target/nacos-server-$version/nacos/bin
        ```
        2.1.2 下载编译后压缩包方式【推荐】
        
        您可以从[最新稳定版本](https://github.com/alibaba/nacos/releases)下载 nacos-server-$version.zip 包。
        ```
           unzip nacos-server-$version.zip 或者 tar -xvf nacos-server-$version.tar.gz
           cd nacos/bin      
        ```
        
    2.2 启动服务器
    
    Linux/Unix/Mac
    启动命令(standalone代表着单机模式运行，非集群模式):
    
    ```sh startup.sh -m standalone```
    
    Windows
    启动命令：
    
    ```cmd startup.cmd```
    
    或者双击startup.cmd运行文件。  
    
    2.3 关闭服务器
    
    Linux/Unix/Mac
    ```sh shutdown.sh```
    
    Windows
    ```cmd shutdown.cmd```
    
    或者双击shutdown.cmd运行文件。  
    
    2.4 nacos web页
    http:your-ip:8848/nacos
    默认账号/默认密码: nacos/nacos
    
    **【ATTENTION PLEASE】: 禁止将本地服务注册到测试或者生产上，违者重罚。**


#### 项目结构


    SpringCloud-Starter:
          ├─common `公共类`
          ├─gateway   (网关)   
          ├─provider  (测试服务)            
              
  

#### 项目介绍

module | 端口 | 介绍 | 服务名称 
:-: | :-: | :-: | :-: 
gateway | 8002 | 网关服务 | gateway |
provider | 6754| 测试服务 | provider | 


	
	
