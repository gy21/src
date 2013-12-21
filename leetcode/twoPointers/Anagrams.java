package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

	public static ArrayList<String> anagrams(String[] strs) {
        HashMap<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();
		    ArrayList<String> res = new ArrayList<String>();
		    if(strs.length < 2){
		        return res;
		    }
		        for(String s : strs){
		            char [] a = s.toCharArray();
		            Arrays.sort(a);
		            String newformedS = new String(a);
		            if(!m.containsKey(newformedS)){
		                ArrayList<String> arr = new ArrayList<String>();
		                arr.add(s);
		                m.put(newformedS, arr);
		            }
		            else{
		                ArrayList<String> arr = m.get(newformedS);
		                arr.add(s);
		            }
		        
		        }
		        
		        for(String i : m.keySet()){
		           ArrayList<String> arr = m.get(i);
		           //����Ϊû�м����size����1����OJ��ͨ��
		           //�����Ҫ���ǿ���ô��������ˡ�
		           //�����û��anagram�Ͳ������result����Ļ�����Ҫ������жϵġ�
		            if(arr.size()> 1){
    		           for(String mm:arr){
    		        	   res.add(mm);
    		           }
		            }
		        }
		        
		        return res;
    }
	
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		String[] strs = {"abc","edg"};
		System.out.println(Anagrams.anagrams(strs));

	}

}
