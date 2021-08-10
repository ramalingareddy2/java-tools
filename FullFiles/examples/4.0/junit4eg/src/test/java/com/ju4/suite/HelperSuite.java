package com.ju4.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ju4.helper.ArrayHelperTest;
import com.ju4.helper.FileHelperTest;

@RunWith(Suite.class)
@SuiteClasses({ ArrayHelperTest.class, FileHelperTest.class })
public class HelperSuite {

}
