/**
 * @author 作者 lenovo
 * @Time 文件创建时间 2017年11月26日 上午10:17:58
 */
package cn.com.git.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <b>描述：</b> 用一句话描述该类的功能
 * 
 * @author 作者 lenovo
 * @version 版本号 2017年11月26日 上午10:17:58
 * @since 适用版本
 */
public class Provider {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		System.out.println(context.getDisplayName() + ": here");
		context.start();
		System.out.println("服务已经启动...");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
