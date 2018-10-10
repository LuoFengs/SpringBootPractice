# SpringBoot--MyBatis--Druid 整合
##介绍application文件
    yml和properties结尾的两个文件，在项目启动时都会被扫描，优先扫描.yml文件
    再扫描properties文件，如果说在yml文件中写了server:
                                              port:8080
    并在properties中写了server.port=8090 
    由于扫描顺序 后面覆盖前面，因此最终端口号为8090
##配置ORM--mybatis
    pom.xml 引入
    
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>1.3.2</version>
    </dependency>
##配置数据源--druid 
    pom.xml 引入
    
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid-spring-boot-starter</artifactId>
        <version>1.1.9</version>
    </dependency>
