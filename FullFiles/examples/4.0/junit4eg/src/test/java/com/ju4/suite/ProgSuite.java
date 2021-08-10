package com.ju4.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ju4.bean.ParamCalculatorTest;
import com.ju4.bean.WordGameTest;

@RunWith(Suite.class)
@SuiteClasses({ ParamCalculatorTest.class, WordGameTest.class })
public class ProgSuite {

}
