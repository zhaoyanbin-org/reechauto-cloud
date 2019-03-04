package com.reechauto.cloud.common.enums;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonValue;
import com.reechauto.cloud.common.exception.EnumsException;

/**
 * 
 * @author zhaoyanbin
 *
 */
public enum NoticeTypeEnum {
	LIKES("likes", "点赞"), COMMENT("comment", "评论");
	
	private static final Map<String, String> MAPPING = new LinkedHashMap<String, String>();
	
	static {
		for (NoticeTypeEnum em : NoticeTypeEnum.values()) {
			MAPPING.put(em.getText(), em.getValue());
		}
	}
	
	public static Map<String, String> mapping() {
		return MAPPING;
	}


	@ToJson
	private String value;
	@ToJson
	private String text;

	NoticeTypeEnum(String value, String text) {
		this.value = value;
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static NoticeTypeEnum get(String enumValue) {
		NoticeTypeEnum[] var1 = values();
		int var2 = var1.length;
		for (int var3 = 0; var3 < var2; ++var3) {
			NoticeTypeEnum em = var1[var3];
			if (em.getValue().equals(enumValue)) {
				return em;
			}
		}

		throw new EnumsException("Can\'t get enum with this enumValue '"+enumValue+"'");
	}
	
	@JsonValue
	public Map<String, Object> jsonValue() throws EnumsException, IllegalAccessException {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = getClass().getDeclaredFields();
		for (Field f : fields) {
			ToJson toJson = f.getAnnotation(ToJson.class);
			if (toJson != null) {
				f.setAccessible(true);
				Object v = f.get(this);
				map.put(f.getName(), v);
			}
		}
		return map;
	}

}
