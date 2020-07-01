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

# Controller
``@GetMapping({"/hello", "/hi""})``<br>
可以给类上加一个注解，实现所有方法url的前缀url``@RequestMapping("/hello")``<br>
获取url传参
|注解|功能|
|--|--|
|@PathVariable|获取Url中的数据|
|@RequestParam|获取请求参数中的数据|

# 数据库
数据库引擎`MyISAM`不支持事务，`InnoDB`支持