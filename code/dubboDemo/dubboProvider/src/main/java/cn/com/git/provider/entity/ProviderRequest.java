/**
 * @author 作者 lenovo
 * @Time 文件创建时间 2017年11月26日 下午7:30:29
 */
package cn.com.git.provider.entity;

/**
 *<b>描述：</b> 
 * 		接口的请求对象
 * @author  作者 lenovo
 * @version 版本号 2017年11月26日 下午7:30:29
 * @since 适用版本 
 */
public class ProviderRequest {
	
	//请求头
	private ProviderRequestHeader header ;
	//请求体
	private ProviderRequestBody body ;
	
	/**
	 * @return the header
	 */
	public ProviderRequestHeader getHeader() {
		return header;
	}
	/**
	 * @param header the header to set
	 */
	public void setHeader(ProviderRequestHeader header) {
		this.header = header;
	}
	/**
	 * @return the body
	 */
	public ProviderRequestBody getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(ProviderRequestBody body) {
		this.body = body;
	}
	
	
}
