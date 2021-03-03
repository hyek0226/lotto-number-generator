import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CurcleList {
	// Curcle 클래스를 담는 List
	List<Curcle> list;
	// boolean (틀린 숫자(false)인지 맞은 숫자(true)인지) 값을 넣는 배열
	List<Boolean> list2;
	// 랜덤한 숫자를 담는 List
	List<Integer> resultList;
	// 선택한 숫자를 담는 List
	List<Integer> selectList;
	// 랜덤한 숫자와 선택한 숫자 중 맞는 배열만 넣는 List
	List<Integer> equalList;
	// true : 2등 false : 1, 3~5등
	boolean oneTwo = false;
	int count = 0;
	public CurcleList(Set<Integer> num, Set<Integer> num2) {
		list = new ArrayList<>();
		list2 = new ArrayList<>();
		resultList = new ArrayList<>();
		selectList = new ArrayList<>();
		equalList = new ArrayList<>();
		
		// 파라미터로 받아온 랜덤 숫자와 선택한 숫자 Set을 List에 새로 담음
		Iterator<Integer> iterator = num.iterator();
		while (iterator.hasNext()) {
			resultList.add(iterator.next());
		}
		Iterator<Integer> iterator2 = num2.iterator();
		while (iterator2.hasNext()) {
			selectList.add(iterator2.next());
		}
		
		// 이중 for문으로 랜덤 List와 선택List 중 같은 숫자를 솎아내서 equalList에 담음
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				if (resultList.get(i) == selectList.get(j)) {
					equalList.add(selectList.get(j));
				}
				// 1등과 2등을 가르기 위한 boolean 값 작성
				if (equalList.size() == 6 && selectList.get(5) == resultList.get(6)) {
					oneTwo = true;
				} 
			}
		}
		
		// 이중 for문을 돌려, 처음엔 false 6개를 담고, 다음은 맞는 숫자를 찾아 그 자리에 true로 값을 교체
		for (int i = 0; i < 6; i++) {
			list2.add(false);
			for (int j = 0; j < equalList.size(); j++) {
				if (selectList.get(i) == equalList.get(j)) {
					list2.set(i, true);
					count++;
				}
			}
		}
	}
	
	public List<Curcle> getList() {
		return list;
	}
	public void setList(List<Curcle> list) {
		this.list = list;
	}
	
	public List<Boolean> getList2() {
		return list2;
	}

	public boolean isOneTwo() {
		return oneTwo;
	}

	public int getCount() {
		return count;
	}
	
	// 랜덤 공을 생성하는 메소드
	public List<Curcle> getResultList() {
		for (int i = 0; i < 7; i++) {
			list.add(new Curcle(resultList.get(i), true));
		}
		return list;
	}
	
	// 선택한 공을 생성하는 메소드
	public List<Curcle> getSelectList() {
		for (int i = 0; i < 6; i++) {
			list.add(new Curcle(selectList.get(i), list2.get(i)));
		}
		return list;
	}
	
}
