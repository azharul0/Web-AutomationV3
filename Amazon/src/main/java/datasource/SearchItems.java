package datasource;

import Base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class SearchItems {

    public static void searchItems() {
        List<String> list = getItemList();
        for(int i=0; i<list.size(); i++) {
            CommonAPI.typeOnWebElementNHitEnter("#twotabsearchtextbox", list.get(i));
            CommonAPI.clearInputBox("#twotabsearchtextbox");
        }
    }

    public static List<String> getItemList(){
        List<String> list = new ArrayList<>();
        list.add("ipad");
        list.add("apple watch");
        list.add("charger");
        list.add("laptop");

        return list;
    }
}
