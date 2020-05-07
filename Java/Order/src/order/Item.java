package order;

import java.util.ArrayList;

public class Item {

	ItemInfo info;
	ArrayList<ItemInfo> list;

	Item() {
		info = null;
		list = new ArrayList<>();

	}

	void  itemList() {
		// String big = "강아지" , medium ="사료", name = "소형견 사료"; int price = 25700 , count
		// = 50;
		// list = new CanOrderList(big, medium, "소형견 사료", 25700, 50);
		list.add(new ItemInfo("강아지", "사료\t", "소형견 사료", 25700, 50));
		list.add(new ItemInfo("강아지", "사료\t", "중형견 사료", 35200, 50));
		list.add(new  ItemInfo("강아지", "사료\t", "중형견 사료", 51000, 50));
		list.add(new  ItemInfo("강아지", "간식\t", "강아지 껌", 9800, 50));
		list.add(new  ItemInfo("강아지", "간식\t", "강아지 육포", 12100, 50));
		list.add(new  ItemInfo("강아지", "간식\t", "강아지 먹는 치약", 13800, 50));
		list.add(new  ItemInfo("강아지", "장난감\t", "애견 이갈이 탱탱볼", 23000, 50));
		list.add(new  ItemInfo("강아지", "장난감\t", "애견 노즈워크 담요", 37900, 50));
		list.add(new  ItemInfo("강아지", "장난감\t", "대형견 장난감 인형", 8900, 50));
		list.add(new  ItemInfo("강아지", "미용도구", "애견 셀프 미용 이발기", 8900, 50));
		list.add(new  ItemInfo("강아지", "미용도구", "애견 털 브러쉬", 15900, 50));
		list.add(new  ItemInfo("강아지", "미용도구", "애견 목욕 장갑", 5300, 50));
		list.add(new ItemInfo("고양이", "사료\t", "소형묘 사료", 26900, 50));
		list.add(new ItemInfo("고양이", "사료\t", "중형묘 사료", 34450, 50));
		list.add(new ItemInfo("고양이", "사료\t", "대형묘 사료", 47500, 50));
		list.add(new ItemInfo("고양이", "간식\t", "고양이 츄르", 3800, 50));
		list.add(new ItemInfo("고양이", "간식\t", "참치볼", 11500, 50));
		list.add(new ItemInfo("고양이", "간식\t", "연어볼", 13200, 50));
		list.add(new ItemInfo("고양이", "장난감\t", "고양이 3단 낚시대", 3800, 50));
		list.add(new ItemInfo("고양이", "장난감\t", "냥냥펀치 토이볼", 11500, 50));
		list.add(new ItemInfo("고양이", "장난감\t", "고양이 스크레쳐", 13200, 50));
		list.add(new ItemInfo("고양이", "미용도구", "고양이 천연 샴푸", 3800, 50));
		list.add(new ItemInfo("고양이", "미용도구", "캣 브러쉬", 17900, 50));
		list.add(new ItemInfo("고양이", "미용도구", "고양이 귀 세정제", 15000, 50));

	}
	

	void showAllData() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showData(i);
		}
	}

}
