package com.zjx.dao;

import java.util.List;
import java.util.Map;

import com.zjx.entity.BlogType;

public interface BlogTypeDao {

	/**
	 * ��ѯ���в������ͣ��Լ���Ӧ�Ĳ�������
	 * @return
	 */
	public List<BlogType> countTypeList();
	
	/**
	 * ͨ��id���Ҳ�������ʵ��
	 * @param id
	 * @return
	 */
	public BlogType findById(Integer id);
	
	/**
	 * ��ҳ��ѯ���������Ϣ
	 * @param map
	 * @return
	 */
	public List<BlogType> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public long getTotal(Map<String,Object> map);
	
	/**
	 * ��Ӳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer add(BlogType blogType);
	
	/**
	 * �޸Ĳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer update(BlogType blogType);
	
	/**
	 * ɾ�����������Ϣ
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}
