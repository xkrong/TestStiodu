package com.rule;


import java.util.HashMap;

import com.amarsoft.are.ARE;
import com.amarsoft.core.json.JSONObject;
import com.amarsoft.core.object.ResultObject;
import com.amarsoft.core.util.CommonUtil;
import com.amarsoft.core.util.StringUtil;
import com.amarsoft.rule.xfire.RuleServicePortType;
import com.amarsoft.rule.xfire.RuleServicesClient;

public class NewRule {
	private String source;
	public static void main(String[] args) throws Exception { 
		HashMap hMap=new HashMap();
		hMap.put("1", "a");
		hMap.put("2", "b");
		hMap.put("3", "c");
		/*Iterator it = hMap.entrySet().iterator();
		while (it.hasNext()) {
			Object entry= it.next();
			System.out.println(entry);

			Object ss=entry;
			Map.Entry sss=(Map.Entry)ss;
			
		}
		*/
		//Vector vector=new Vector();
		//vector.addElement("abc");
		
		//System.out.println(vector.get(0));

		JSONObject jObject=new JSONObject(hMap);
		System.out.println(jObject.get("3"));
		/*JSONObject jObject=CommonUtil.setNodeValue(new JSONObject(), "BJ.V_BASI_D1.V_BASI_D1_019", "20");
		System.out.println(CommonUtil.getNodeValue(jObject, "BJ.V_BASI_D1.V_BASI_D1_019", "0"));
		JSONObject s=jObject.getJSONObject("BJ");
		System.out.println(s);
		System.out.println(s.getJSONObject("V_BASI_D1").get("V_BASI_D1_019"));*/
		//System.out.println(jObject.getJSONObject("BJ").getJSONObject("V_BASI_D1").get("V_BASI_D1_019"));
		//new NewRule().execute();
		/*String cardCurDue3FlaglessThan300="N";
		String sF1="3";
		String sDueSum="200";
		if ("N".equals(cardCurDue3FlaglessThan300) && sF1!=null && ("34567".indexOf(sF1)>=0) && Float.parseFloat(sDueSum.replace(",",""))<=300) {
			cardCurDue3FlaglessThan300 = "Y";
		}
		System.out.println(cardCurDue3FlaglessThan300+"--------"+Float.parseFloat(sDueSum.replace(",","")));*/
	}

	public  void execute() throws Exception {
		
			ARE.getLog().info("========================����=====================");
			String sParam  = "";
			//������������
			String sAPP = "http://localhost:9000/ruleservice";//Ӧ�ñ�ţ�Ŀǰ���������
			String sUser = "app";//���ù�����û���Ŀǰ���������
			String sPassword = "app";//���ù�����û����룬Ŀǰ���������
			String sModelID = "TESTBJ";//���õĹ���ģ��
			String sRuleType = "RuleFlow";//��������
			String sRuleID = "test3";//���������  BCFC_�������
			RuleServicesClient rsc = null;
			RuleServicePortType rsp = null;
			rsc = new RuleServicesClient();
			rsp = rsc.getRuleServicePort(sAPP);
			ResultObject jObject = new ResultObject("");
			jObject.setResult("TESTBJ.test01.test02", "142726");
			rsp.callObject(sUser, sPassword, sAPP, sModelID, sRuleType, sRuleID,jObject.toString(), sParam);
			 
			
	}
}
