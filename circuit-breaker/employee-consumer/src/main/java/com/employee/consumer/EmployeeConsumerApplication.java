package com.employee.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConsumerApplication.class, args);
	}
	//Circuit Breaker pattern code
/**
 * public static void main(String[] args) throws RestClientException, IOException {
 * 		ApplicationContext ctx = SpringApplication.run(
 * 				SpringBootHelloWorldApplication.class, args);
 *
 * 		ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
 * 		System.out.println(consumerControllerClient);
 * 		for(int i=0;i<100;i++)
 * 		consumerControllerClient.getEmployee();
 *
 *        }
 *
 *    @Bean
 *    public  ConsumerControllerClient  consumerControllerClient()
 *    {
 * 		return  new ConsumerControllerClient();
 *    }
 * }
 */
}
