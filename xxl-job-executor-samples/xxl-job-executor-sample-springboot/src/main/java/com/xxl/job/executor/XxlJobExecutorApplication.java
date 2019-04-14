package com.xxl.job.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://github.com/xuxueli/xxl-job
@SpringBootApplication
public class XxlJobExecutorApplication {

	/**
	 * http://127.0.0.1:8081/xxl-job-admin
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(XxlJobExecutorApplication.class, args);
	}

}