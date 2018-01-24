/**
 * @author 作者 lenovo
 * @Time 文件创建时间 2017年11月26日 下午7:32:07
 */
package cn.com.git.provider.entity;

import java.util.Date;

/**
 *<b>描述：</b> 
 * 		响应头
 * @author  作者 lenovo
 * @version 版本号 2017年11月26日 下午7:32:07
 * @since 适用版本 
 */
public class ProviderResponseHeader {
	
	//状态 0 成功    -1 失败
	private int state ;
	//提示内容
	private String msg ;
	//响应时间节点
	private Date respTime ;
	//请求持续时长
	private long times ;
	
	
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the times
	 */
	public long getTimes() {
		return times;
	}
	/**
	 * @param times the times to set
	 */
	public void setTimes(long times) {
		this.times = times;
	}
	/**
	 * @return the respTime
	 */
	public Date getRespTime() {
		return respTime;
	}
	/**
	 * @param respTime the respTime to set
	 */
	public void setRespTime(Date respTime) {
		this.respTime = respTime;
	}
	
	
}
