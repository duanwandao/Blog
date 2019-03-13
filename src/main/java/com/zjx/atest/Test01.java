package com.zjx.atest;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test01 {

	public static void main(String[] args) {
		String JsonContext2="[Goodsinfo [id=1, picture=http://www.sinokin.com/soa/img/images/G44fae21fd2e1d/2011/11/03/P4eb1f54850773.jpg, name=°ü, price=111],"
				+ "Goodsinfo [id=2, picture=http://i.ebayimg.com/00/s/NTAwWDc1MA==/z/yG0AAOSwxfNXNptj/%24_12.JPG?set_id=880000500F, name=ÊÖ±í, price=222]]";
	
		Goodsinfo goodsinfo=new Goodsinfo(1, "aaa", "bbb", 1);
		Goodsinfo goodsinfo2=new Goodsinfo(2, "aaa", "bbb", 2);
		List<Goodsinfo> goodsinfoList=new ArrayList<Goodsinfo>();
		goodsinfoList.add(goodsinfo);
		goodsinfoList.add(goodsinfo2);
		JSONArray jsonArray = JSONArray.fromObject(goodsinfoList);
		int size = jsonArray.size();  
	    System.out.println("Size: " + size);  
	    for(int  i = 0; i < size; i++){  
            JSONObject jsonObject = jsonArray.getJSONObject(i);  
            Integer id=(Integer) jsonObject.get("id");
            System.out.println(id+"");
            
	    }   
		//System.out.println(goodsinfoList);
	}
}
