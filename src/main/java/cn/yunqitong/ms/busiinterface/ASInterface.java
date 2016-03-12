package cn.yunqitong.ms.busiinterface;

import java.util.Date;

import org.apache.log4j.Logger;

import cn.yunqitong.util.CipherUtil;
import cn.yunqitong.util.DateUtil;
import cn.yunqitong.util.HttpClientUtil;
import cn.yunqitong.util.PropertyFactory;
import net.sf.json.JSONObject;

public class ASInterface {
	protected static Logger log = Logger.getLogger(ASInterface.class);

	
	// 会议启动、结束通知
	public static void notifyMeetingStatus(String id, String uuid, String status, String host_id) {
		JSONObject requestJson = new JSONObject();
		requestJson.put("id", id);
		requestJson.put("uuid", uuid);
		requestJson.put("status", status);
		requestJson.put("host_id", host_id);
		String dateStr = DateUtil.getString(new Date());
		requestJson.put("authenticator", CipherUtil.encryptWithSHA256(PropertyFactory.getProperty("as_defaultKey")+dateStr));
		requestJson.put("timestamp", dateStr);
		String requestJsonStr = requestJson.toString();
		log.info("开始调用as会议通知接口：" + requestJsonStr);
		String url = PropertyFactory.getProperty("as_url");
		try {
			String textEntity = HttpClientUtil.doPostHttp(url + "meeting/nofity", requestJsonStr);
			log.info("response textEntity = " + textEntity);
		} catch (Exception ex) {
			log.debug("调用as会议通知接口异常 = " + ex);
		}
	}
	
}
