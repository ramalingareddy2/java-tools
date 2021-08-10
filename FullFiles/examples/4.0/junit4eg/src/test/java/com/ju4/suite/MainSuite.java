package com.ju4.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ProgSuite.class, HelperSuite.class, DaoSuite.class })
public class MainSuite {

}
