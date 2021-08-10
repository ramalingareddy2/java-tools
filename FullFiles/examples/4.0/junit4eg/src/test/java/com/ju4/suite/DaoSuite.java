package com.ju4.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.ju4.dao.StaffDaoTest;

import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses({ StaffDaoTest.class })
public class DaoSuite {

}
