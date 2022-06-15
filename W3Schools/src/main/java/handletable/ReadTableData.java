package handletable;

import Base.CommonAPI;

public class ReadTableData {

    public static void readTable(){
       String text = CommonAPI.getWebText(".ws-table-all.notranslate tr:nth-child(3) td:nth-child(3)");
        System.out.println(text);
    }
}
