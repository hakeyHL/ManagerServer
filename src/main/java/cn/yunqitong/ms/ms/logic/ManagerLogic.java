package cn.yunqitong.ms.ms.logic;

import java.net.URLEncoder;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import cn.yunqitong.ms.ms.dao.client.TUsersMapper;
import cn.yunqitong.ms.ms.dao.model.TUsers;
import cn.yunqitong.ms.ms.dao.model.TUsersExample;
import cn.yunqitong.util.DateUtil;
import cn.yunqitong.util.HttpsUtil;
import cn.yunqitong.util.PropertyFactory;
import cn.yunqitong.util.SignUtil;
import cn.yunqitong.util.TokenGenerate;

@Service
public class ManagerLogic {
	protected Logger log = Logger.getLogger(ManagerLogic.class);
	@Autowired
	private TUsersMapper userMapper;
	/**
	 * 向OSS跳转
	 * 
	 * @return
	 */
	public String geToken2OSS() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String username = authentication.getName();
		String name = username;
		TUsersExample userExample=new TUsersExample();
		userExample.createCriteria().andNameEqualTo(name);
		TUsers user=null;
		try {
			List<TUsers> userList = userMapper.selectByExample(userExample);
			if(userList.size()>0&&userList!=null){
				//查询到
				user=userList.get(0);
			}
		} catch (Exception e) {
			log.error("根据用户名查询用户时异常.."+e.getMessage(),e);
		}
		String userId = user.getId()+"";
		String token = null;
		try {
			token = TokenGenerate.getRandmonVerifyCode(25)
					+ DateUtil.get14Date(new Date());
		} catch (ParseException e2) {
			log.error("日期转换失败" + e2.getMessage(), e2);
		}
		String data = name + "#" + userId + "#" + token;
		try {
			data = SignUtil.getSign(data,
					PropertyFactory.getProperty("PrivateKeyPath"));
		} catch (Exception e1) {
			log.error("加密数据时异常" + e1.getMessage(), e1);
		}
		String MSLOGINOSSURL = PropertyFactory.getProperty("MSLOGINOSSURL");
		log.info("oss url " + MSLOGINOSSURL);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("data", URLEncoder.encode(data)));
		String responseText = null;
		try {
			responseText = new HttpsUtil().doPost(MSLOGINOSSURL, nvps);
			log.info("restext " + responseText);
			JSONObject fromObject = JSONObject.fromObject(responseText);
			if (!fromObject.optString("errorcode").equals("00000")) {
				return null;
			}
		} catch (Throwable e) {
			log.error("请求跳转oss异常" + e.getMessage(), e);
			return null;
		}
		return PropertyFactory.getProperty("MSLOGINOSSURL") + "?token=" + token;
	}

	/**
	 * 跳转至as
	 * 
	 * @return
	 */
	public String geToken2AS() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String username = authentication.getName();
		String name = username;
		TUsersExample userExample=new TUsersExample();
		userExample.createCriteria().andNameEqualTo(name);
		TUsers user=null;
		try {
			List<TUsers> userList = userMapper.selectByExample(userExample);
			if(userList.size()>0&&userList!=null){
				//查询到
				user=userList.get(0);
			}
		} catch (Exception e) {
			log.error("根据用户名查询用户时异常.."+e.getMessage(),e);
		}
		String userId = user.getId()+"";
		String token = null;
		try {
			token = TokenGenerate.getRandmonVerifyCode(25)
					+ DateUtil.get14Date(new Date());
		} catch (ParseException e2) {
			log.error("日期转换失败" + e2.getMessage(), e2);
		}
		String data = name + "#" + userId + "#" + token;
		try {
			data = SignUtil.getSign(data,
					PropertyFactory.getProperty("PrivateKeyPath"));
		} catch (Exception e1) {
			log.error("加密数据时异常" + e1.getMessage(), e1);
		}
		String MSLOGINASURL = PropertyFactory.getProperty("MSLOGINASURL");
		log.info("oss url " + MSLOGINASURL);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("data", URLEncoder.encode(data)));
		String responseText = null;
		try {
			responseText = new HttpsUtil().doPost(MSLOGINASURL, nvps);
			log.info("restext " + responseText);
			JSONObject fromObject = JSONObject.fromObject(responseText);
			if (!fromObject.optString("errorcode").equals("00000")) {
				return null;
			}
		} catch (Throwable e) {
			log.error("请求跳转as异常" + e.getMessage(), e);
			return null;
		}
		return PropertyFactory.getProperty("MSLOGINASURL") + "?token=" + token;
	}
	/**
	 * 跳转至bss
	 * @return
	 */
	public String geToken2BSS() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String username = authentication.getName();
		String name = username;
		TUsersExample userExample=new TUsersExample();
		userExample.createCriteria().andNameEqualTo(name);
		TUsers user=null;
		try {
			List<TUsers> userList = userMapper.selectByExample(userExample);
			if(userList.size()>0&&userList!=null){
				//查询到
				user=userList.get(0);
			}
		} catch (Exception e) {
			log.error("根据用户名查询用户时异常.."+e.getMessage(),e);
		}
		String userId = user.getId()+"";
		String token = null;
		try {
			token = TokenGenerate.getRandmonVerifyCode(25)
					+ DateUtil.get14Date(new Date());
		} catch (ParseException e2) {
			log.error("日期转换失败" + e2.getMessage(), e2);
		}
		String data = name + "#" + userId + "#" + token;
		try {
			data = SignUtil.getSign(data,
					PropertyFactory.getProperty("PrivateKeyPath"));
		} catch (Exception e1) {
			log.error("加密数据时异常" + e1.getMessage(), e1);
		}
		String MSLOGINBSSURL = PropertyFactory.getProperty("MSLOGINBSSURL");
		log.info("oss url " + MSLOGINBSSURL);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("data", URLEncoder.encode(data)));
		String responseText = null;
		try {
			responseText = new HttpsUtil().doPost(MSLOGINBSSURL, nvps);
			log.info("restext " + responseText);
			JSONObject fromObject = JSONObject.fromObject(responseText);
			if (!fromObject.optString("errorcode").equals("00000")) {
				return null;
			}
		} catch (Throwable e) {
			log.error("请求跳转bss异常" + e.getMessage(), e);
			return null;
		}
		return PropertyFactory.getProperty("MSLOGINBSSURL") + "?token=" + token;
	}
	/**
	 * 跳转至四川联通的adapter
	 * @return
	 */
	public String geToken2chuanAdapter() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String username = authentication.getName();
		String name = username;
		TUsersExample userExample=new TUsersExample();
		userExample.createCriteria().andNameEqualTo(name);
		TUsers user=null;
		try {
			List<TUsers> userList = userMapper.selectByExample(userExample);
			if(userList.size()>0&&userList!=null){
				//查询到
				user=userList.get(0);
			}
		} catch (Exception e) {
			log.error("根据用户名查询用户时异常.."+e.getMessage(),e);
		}
		String userId = user.getId()+"";
		String token = null;
		try {
			token = TokenGenerate.getRandmonVerifyCode(25)
					+ DateUtil.get14Date(new Date());
		} catch (ParseException e2) {
			log.error("日期转换失败" + e2.getMessage(), e2);
		}
		String data = name + "#" + userId + "#" + token;
		try {
			data = SignUtil.getSign(data,
					PropertyFactory.getProperty("PrivateKeyPath"));
		} catch (Exception e1) {
			log.error("加密数据时异常" + e1.getMessage(), e1);
		}
		String MSLOGINCHUANURL = PropertyFactory.getProperty("MSLOGINCHUANURL");
		log.info("chuan adapter url " + MSLOGINCHUANURL);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("data", URLEncoder.encode(data)));
		String responseText = null;
		try {
			responseText = new HttpsUtil().doPost(MSLOGINCHUANURL, nvps);
			log.info("restext " + responseText);
			JSONObject fromObject = JSONObject.fromObject(responseText);
			if (!fromObject.optString("errorcode").equals("00000")) {
				return null;
			}
		} catch (Throwable e) {
			log.error("请求跳转bss异常" + e.getMessage(), e);
			return null;
		}
		return PropertyFactory.getProperty("MSLOGINCHUANURL") + "?token=" + token;
	}
	/**
	 * 跳转到恋家bss
	 * @return
	 */
	public String geToken2lianjiabss() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String username = authentication.getName();
		String name = username;
		TUsersExample userExample=new TUsersExample();
		userExample.createCriteria().andNameEqualTo(name);
		TUsers user=null;
		try {
			List<TUsers> userList = userMapper.selectByExample(userExample);
			if(userList.size()>0&&userList!=null){
				//查询到
				user=userList.get(0);
			}
		} catch (Exception e) {
			log.error("根据用户名查询用户时异常.."+e.getMessage(),e);
		}
		String userId = user.getId()+"";
		String token = null;
		try {
			token = TokenGenerate.getRandmonVerifyCode(25)
					+ DateUtil.get14Date(new Date());
		} catch (ParseException e2) {
			log.error("日期转换失败" + e2.getMessage(), e2);
		}
		String data = name + "#" + userId + "#" + token;
		try {
			data = SignUtil.getSign(data,
					PropertyFactory.getProperty("PrivateKeyPath"));
		} catch (Exception e1) {
			log.error("加密数据时异常" + e1.getMessage(), e1);
		}
		String MSLOGINLIANJIABSS = PropertyFactory.getProperty("MSLOGINLIANJIABSS");
		log.info(" lianjia bss url " + MSLOGINLIANJIABSS);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("data", URLEncoder.encode(data)));
		String responseText = null;
		try {
			responseText = new HttpsUtil().doPost(MSLOGINLIANJIABSS, nvps);
			log.info("restext " + responseText);
			JSONObject fromObject = JSONObject.fromObject(responseText);
			if (!fromObject.optString("errorcode").equals("00000")) {
				return null;
			}
		} catch (Throwable e) {
			log.error("请求跳转bss异常" + e.getMessage(), e);
			return null;
		}
		return PropertyFactory.getProperty("MSLOGINLIANJIABSS") + "?token=" + token;
	}

	public String geToken2lianjiadss() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String username = authentication.getName();
		String name = username;
		TUsersExample userExample=new TUsersExample();
		userExample.createCriteria().andNameEqualTo(name);
		TUsers user=null;
		try {
			List<TUsers> userList = userMapper.selectByExample(userExample);
			if(userList.size()>0&&userList!=null){
				//查询到
				user=userList.get(0);
			}
		} catch (Exception e) {
			log.error("根据用户名查询用户时异常.."+e.getMessage(),e);
		}
		String userId = user.getId()+"";
		String token = null;
		try {
			token = TokenGenerate.getRandmonVerifyCode(25)
					+ DateUtil.get14Date(new Date());
		} catch (ParseException e2) {
			log.error("日期转换失败" + e2.getMessage(), e2);
		}
		String data = name + "#" + userId + "#" + token;
		try {
			data = SignUtil.getSign(data,
					PropertyFactory.getProperty("PrivateKeyPath"));
		} catch (Exception e1) {
			log.error("加密数据时异常" + e1.getMessage(), e1);
		}
		String MSLOGINLIANJIADSS = PropertyFactory.getProperty("MSLOGINLIANJIADSS");
		log.info(" lianjia dss url " + MSLOGINLIANJIADSS);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("data", URLEncoder.encode(data)));
		String responseText = null;
		try {
			responseText = new HttpsUtil().doPost(MSLOGINLIANJIADSS, nvps);
			log.info("restext " + responseText);
			JSONObject fromObject = JSONObject.fromObject(responseText);
			if (!fromObject.optString("errorcode").equals("00000")) {
				return null;
			}
		} catch (Throwable e) {
			log.error("请求跳转dss异常" + e.getMessage(), e);
			return null;
		}
		return PropertyFactory.getProperty("MSLOGINLIANJIADSS") + "?token=" + token;
	}
	/**
	 * 跳转到MediaServer 恋家
	 * @return
	 */
	public String geToken2Media() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		String username = authentication.getName();
		String name = username;
		TUsersExample userExample=new TUsersExample();
		userExample.createCriteria().andNameEqualTo(name);
		TUsers user=null;
		try {
			List<TUsers> userList = userMapper.selectByExample(userExample);
			if(userList.size()>0&&userList!=null){
				//查询到
				user=userList.get(0);
			}
		} catch (Exception e) {
			log.error("根据用户名查询用户时异常.."+e.getMessage(),e);
		}
		String userId = user.getId()+"";
		String token = null;
		try {
			token = TokenGenerate.getRandmonVerifyCode(25)
					+ DateUtil.get14Date(new Date());
		} catch (ParseException e2) {
			log.error("日期转换失败" + e2.getMessage(), e2);
		}
		String data = name + "#" + userId + "#" + token;
		try {
			data = SignUtil.getSign(data,
					PropertyFactory.getProperty("PrivateKeyPath"));
		} catch (Exception e1) {
			log.error("加密数据时异常" + e1.getMessage(), e1);
		}
		String MSLOGINLIANJIAMEDIA = PropertyFactory.getProperty("MSLOGINLIANJIAMEDIA");
		log.info(" lianjia MediaServer url " + MSLOGINLIANJIAMEDIA);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("data", URLEncoder.encode(data)));
		String responseText = null;
		try {
			log.info("req text "+nvps);
			responseText = new HttpsUtil().doPost(MSLOGINLIANJIAMEDIA, nvps);
			log.info("restext " + responseText);
			JSONObject fromObject = JSONObject.fromObject(responseText);
			if (!fromObject.optString("errorcode").equals("00000")) {
				return null;
			}
		} catch (Throwable e) {
			log.error("请求跳转恋家MediaServer异常" + e.getMessage(), e);
			return null;
		}
		return PropertyFactory.getProperty("MSLOGINLIANJIAMEDIA") + "?token=" + token;
	}

}
