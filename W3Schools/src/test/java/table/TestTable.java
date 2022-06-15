package table;

import Base.CommonAPI;
import handletable.ReadTableData;
import org.testng.annotations.Test;

public class TestTable extends CommonAPI {

    @Test
    public void readTableText(){
        ReadTableData.readTable();
    }
}
