package com.yashebook;

import com.yashebook.rpc.Server;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yashebook.domain.mapper")
public class YashebookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YashebookServiceApplication.class, args);
		new Server("imwallet-pay-123", "0.0.0.0", 40313).start();
	}
}
