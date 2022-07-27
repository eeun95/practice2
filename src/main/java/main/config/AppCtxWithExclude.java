package main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.MemberDao;

@Configuration
@ComponentScan(basePackages = {"spring"},
excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "spring\\..*Dao"))
// FilterType.REGEX : 정규표현식을 사용해서 제외 대상 지정
// pattern = "spring\\..*Dao : spring.으로 이작하고 Dao로 끝나는 정규표현식 지정

// ASPECTJ 패턴
// excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "spring.*Dao")
public class AppCtxWithExclude {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }
}
