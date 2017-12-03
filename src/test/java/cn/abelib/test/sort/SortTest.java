package cn.abelib.test.sort;

import cn.abelib.util.data.EnumType;
import cn.abelib.util.data.test.TestException;
import cn.abelib.util.data.EnumSort;
import cn.abelib.util.data.test.ResultTest;
import cn.abelib.util.StdIO;

/**
 * Created by huangjinajin on 2017/7/19.
 * A basic cn.abelib.util.data.test class for all Sort Alg
 */
public class SortTest {
    public static void main(String [] args){
        ResultTest rstTest = new ResultTest();
        try{
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.INSERT_SORT);
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.SELECTION_SORT);
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.SHELL_SORT);
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.MERGE_SORT_1);
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.MERGE_SORT_2);
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.QUICK_SORT_1);
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.QUICK_SORT_2);
            rstTest.testSort(10, 10, EnumType.DOUBLE_TYPE, EnumSort.HEAP_SORT);
        }catch (TestException te){
            StdIO.println(te.toString());
        }
    }
}