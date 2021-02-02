package rambo.plugin.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rambo.plugin.module.mapper")
public class SpringbootPluginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPluginApplication.class, args);
    }
}
