package pen.study.core;

import java.util.List;

import pen.study.internal.util.Array2StringUtil;

/**
 * 配列要素を標準出力する
 * 
 * @author pentaro
 */
public class Array2Stdout {

    /**
     * 引数で受け取った配列を標準出力する
     * 
     * @param list 標準出力対象
     */
    public static void stdout(List<?> list) {
	try {
	    // 引数チェックは内部クラスに任せる
	    System.out.println(Array2StringUtil.array2String(list));
	} catch (IllegalArgumentException e) {
	    // エラー出力
	    System.err.println(e);
	}
    }

}
