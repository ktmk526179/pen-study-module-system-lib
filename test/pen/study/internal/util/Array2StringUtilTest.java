package pen.study.internal.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Array2StringUtilTest {

    /*
     * テストデータを格納する
     */
    private List<String> data = new ArrayList<String>();

    /**
     * case1 配列要素が1つの時
     */
    @Test
    public void testArray2String01() {
	// when
	data.add("hoge");

	// execute
	String result = Array2StringUtil.array2String(data);

	// assert
	assertEquals("配列要素001:hoge\n", result);
    }

    /**
     * case2 配列要素が2つの時
     */
    @Test
    public void testArray2String02() {
	// when
	data.add("hoge");
	data.add("fuga");

	// execute
	String result = Array2StringUtil.array2String(data);

	// assert
	assertEquals("配列要素001:hoge\n配列要素002:fuga\n", result);
    }

    /**
     * case3 引数が配列ではない場合
     */
    @Test(expected = IllegalArgumentException.class)
    public void testArray2String03() {
	// when

	// execute
	Array2StringUtil.array2String(null);

	// assert
    }

}
