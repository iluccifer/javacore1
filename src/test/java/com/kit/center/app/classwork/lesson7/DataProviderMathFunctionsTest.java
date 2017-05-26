package com.kit.center.app.classwork.lesson7;


import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

    @RunWith (JUnitParamsRunner.class)

    public class DataProviderMathFunctionsTest {

        @Test

        @FileParameters(value = "src/main/resources/testdata.csv",

                mapper = CsvWithHeaderMapper.class)

        public void dataProviderTestAdd(int argA, int argB, int expOut) {

            Assert.assertEquals(expOut, Math.multiplyExact(argA, argB));


    }

}
