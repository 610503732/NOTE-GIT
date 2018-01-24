/**
 * @author 作者 lenovo
 * @Time 文件创建时间 2017年11月26日 下午7:51:07
 */
package cn.com.git.provider.exception;

/**
 *<b>描述：</b> 
 * 		异常枚举类
 * @author  作者 lenovo
 * @version 版本号 2017年11月26日 下午7:51:07
 * @since 适用版本 
 */
public enum  ProviderException {
	
	TIME_OUT("请求超时",100);
	
	private String msg ;
	
	private int code ;
	
	ProviderException(String msg,int code){
		
		this.msg = msg ;
		
		this.code = code ;
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
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
}
