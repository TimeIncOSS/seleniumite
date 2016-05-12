package com.timeinc.seleniumite.environment;

/**
 MIT License

 Copyright (c) 2016 Time, Inc.

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

import com.timeinc.seleniumite.junit.SimpleSeleniumBuilderTest;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class shouldn't really be run as a test - its mainly here so I can test downstream stuff in
 * remote drivers like browserstack without having to build into another project
 * Created by cweiss1271 on 12/2/15.
 */
//@RunWith(Suite.class)
//@Suite.SuiteClasses({SimpleSeleniumBuilderTest.class })
public class TestSimpleSeleniumBuilderTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestSimpleSeleniumBuilderTest.class);

    @BeforeClass
    public static void runBeforeSuite()
    {
        LOG.info("Calling before before the suite runs");

        // Try for remote
        // This doesnt run before the statics are created
        //System.setProperty("test.configuration.location","/remote-test.json");

    }
}
