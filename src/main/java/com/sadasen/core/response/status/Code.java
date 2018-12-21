package com.sadasen.core.response.status;

import java.io.Serializable;

/**
 * @date 2018年3月11日
 * @author lei.ys
 * @addr company
 * @desc
 */
public class Code implements Serializable {

	private static final long serialVersionUID = -7115441934842593236L;
	
	// ====== 返回状态码
	// 请求成功
	public static final int REQUEST_SUCCESS_CODE = 100;
	// 请求成功通用提示
	public static final String REQUEST_SUCCESS_TIP = "请求成功";
	// 请求错误通用提示
	public static final String REQUEST_ERROR_TIP = "请求无效！";
	// 系统错误通用提示
	public static final String SYSTEM_ERROR_TIP = "系统繁忙，请稍后再试";

}
