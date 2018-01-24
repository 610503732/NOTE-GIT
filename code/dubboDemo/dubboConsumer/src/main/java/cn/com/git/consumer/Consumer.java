/**
 * @author 作者 lenovo
 * @Time 文件创建时间 2017年11月26日 上午10:32:19
 */
package cn.com.git.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.git.provider.service.ProviderService;

/**
 *<b>描述：</b> 
 * 		用一句话描述该类的功能
 * @author  作者 lenovo
 * @version 版本号 2017年11月26日 上午10:32:19
 * @since 适用版本 
 */
public class Consumer {
	public static void main(String[] args) {
		//测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		ProviderService demoService = context.getBean(ProviderService.class);
		System.out.println("consumer");
		System.out.println(demoService.getData());

	}
}
