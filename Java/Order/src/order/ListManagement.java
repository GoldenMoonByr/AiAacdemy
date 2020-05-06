package order;

import java.util.ArrayList;


public class ListManagement {
	
	CanOrderList list;
	ArrayList<CanOrderList>lists;
	
	ListManagement(){
		list = null;
		lists = new ArrayList<>();
	}
	

	void itemList() {
		String big = "강아지" , medium ="사료\t", name = "소형견 사료"; int price = 25700 , count = 50;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "중형견 사료"; price = 35200;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name ="소형견 사료";price = 51000;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		medium = "간식\t"; name = "강아지 껌" ; price = 9800;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "강아지 육포" ; price = 12100;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "강아지 먹는 치약" ; price = 13800;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		medium = "장난감\t"; name = "애견 이갈이 탱탱볼" ; price = 23000;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "애견 노즈워크 담요" ; price = 37900;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "대형견 장난감 인형" ; price = 8900;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		medium = "미용도구"; name = "애견 셀프 미용 이발기" ; price = 16800;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "애견 털 브러쉬" ; price = 15900;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "애견 목욕 장갑" ; price = 5300;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		big = "고양이"; medium ="사료\t"; name = "소형묘 사료"; price = 26900 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "중형묘 사료"; price = 34450 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "대형묘 사료"; price = 47500 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		medium ="간식\t"; name = "고양이 츄르"; price = 3800 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "참치볼"; price = 11500 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "연어볼"; price= 13200 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		medium ="장난감\t"; name = "고양이 3단 낚시대"; price = 11900 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "냥냥펀치 토이볼"; price = 31800 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "고양이 스크레쳐"; price = 12100 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		medium ="미용도구"; name = "고양이용 천연 샴푸"; price = 16800 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		 name = "캣 브러쉬"; price = 17900 ;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);
		name = "고양이 귀 세정제"; price = 15000;
		list = new CanOrderList(big, medium, name, price, count);
		lists.add(list);

		
	}
	
	
	void showAllData(){
		for(int i =0; i<lists.size();i++) {
			lists.get(i).showData();
		}
	}

}
