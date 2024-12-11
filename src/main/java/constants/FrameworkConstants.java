package constants;

/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */




import java.io.File;

public final class FrameworkConstants {

    private FrameworkConstants() {
    }

    private static final String TESTDATAPATH= System.getProperty("user.dir") +"/src/test/resources/data/";
    private static final String TESTDATAFILE= "TestData";


    public static String getDataPath() {
        return TESTDATAPATH;
    }

    public static String getDataFile() {
        return TESTDATAFILE;
    }

}
