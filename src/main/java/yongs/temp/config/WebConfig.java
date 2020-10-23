package yongs.temp.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
				.allowedOrigins("*")
				.allowCredentials(true)	
				.allowedHeaders("*")
				.allowedMethods(
						HttpMethod.GET.name(),
				        HttpMethod.HEAD.name(),
				        HttpMethod.POST.name(),
				        HttpMethod.PUT.name(),
				        HttpMethod.DELETE.name());
    }
    
	@LoadBalanced // @LoadBalanced가 없으면 docker 환경에서 eureka/zipkin call 이 안됨 
    @Bean  
    public RestTemplate restTemplate() {	
		/* Connection Pool 방식을 사용하지 않으려면 */
		return new RestTemplate();
		
		/* Connection Pool 방식을 사용	
    	HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(); 
    	factory.setReadTimeout(5000); // 읽기시간초과, ms 
    	factory.setConnectTimeout(3000); // 연결시간초과, ms 
    	HttpClient httpClient = HttpClientBuilder.create() 
    			.setMaxConnTotal(10) // 최대 오픈되는 커넥션 수
    			.setMaxConnPerRoute(5) // IP,포트 1쌍에 대해 수행 할 연결 수를 제한
    			.build(); 
    	
    	factory.setHttpClient(httpClient); // 동기실행에 사용될 HttpClient 세팅

        return new RestTemplate(factory);
        */
    }
}
