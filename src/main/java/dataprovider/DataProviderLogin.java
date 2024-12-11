package dataprovider;



import constants.FrameworkConstants;
import helpers.ExcelHelpers;

import helpers.SystemHelpers;
import org.testng.annotations.DataProvider;

public class DataProviderLogin {
    @DataProvider(name = "data_provider_add_product")
    public Object[][] data_provider_login() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        Object[][] data = excelHelpers.getDataHashTable(FrameworkConstants.getDataPath() + FrameworkConstants.getDataFile(), "AddProduct", 2, 2);
        return data;
    }
}