package com.jyf.utils;

/**
 * person 相关参数检验 工具类
 * @author xzk
 *
 */
public class PersonCheckUtil {
	
	/**
	   *  检验sex、idNumber 参数null 转换
	 * @param sex
	 * @param idNumber
	 */
	public static void  insertPersonParamsConvert(Integer sex,Integer idNumber) {
		if(sex == null) {
			sex = 0;
		}
		if(idNumber == null) {
			idNumber = 0;
		}
	}

}
