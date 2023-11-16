package com.example.cyberPunk;

import lombok.Value;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication()
@Slf4j
public class CyberPunkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyberPunkApplication.class, args);
		log.info("\n-------------------------------------------------------------\n\t" +
				 "服务启动成功。");
	}

}
