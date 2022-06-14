package cn.gdut.vhr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //身份认证最简单的登陆环境
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin() //表单登陆 1
                .and() //2
                .authorizeRequests() //下面的都是授权的配置 3
                .anyRequest() //任何请求 4
                .authenticated(); //访问任何资源都需要身份认证 5
    }
}
