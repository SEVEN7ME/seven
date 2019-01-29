package xyz.sunf.seven.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author seven
 * @date 2019/1/29 10:58
 * 说明: 服务中心
 */
@EnableEurekaServer
@SpringBootApplication
public class SevenRegisterApplication {
	public static void main(String[] args) {
		SpringApplication.run(SevenRegisterApplication.class, args);
	}
}
