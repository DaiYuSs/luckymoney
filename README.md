# 配置信息
端口8080被占用，改用9090

# 启动方式
``mvn spring-boot:run``

``mvn clean package``打包，``java -jar */*.jar``启动

# 命令行改变生产环境
``java -jar -Dspring.profiles.active=prod */*.jar``就可以使用prod的配置信息

# 模板
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>
```

``@Controller + @ResponseBody = @RestController``