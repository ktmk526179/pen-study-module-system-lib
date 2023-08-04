package pen.study.internal.util;

import java.util.List;

/**
 * 配列文字列変換部品(このパッケージ内での使用を目的とする)
 * 
 * @author pentaro
 */
public class Array2StringUtil {
    /*
     * 固定文言
     */
    private static final String COMMON = "配列要素";

    /*
     * セミコロン
     */
    private static final String SEMICOLON = ":";

    /*
     * 改行コード(LF)
     */
    private static final String LF = "\n";

    /**
     * ArrayListの内容を結合する。
     * 
     * @param al String化対象配列
     * @return 配列要素を結合したString
     */
    public static String array2String(List<?> al) {
	// 結果格納用
	String result = null;

	// 引数チェック
	if (al instanceof List<?>) {

	    // 文字列結合用
	    StringBuilder sb = new StringBuilder();

	    // 項番出力用
	    int i = 1;

	    // var型を使ってみる
	    for (var element : al) {

		// 結合
		sb.append(COMMON).append(String.format("%03d", i)).append(SEMICOLON).append(element.toString())
			.append(LF);

		// インクリメント
		i++;
	    }

	    // 結果格納
	    result = sb.toString();
	} else {
	    // 引数エラー
	    throw new IllegalArgumentException();
	}

	return result;
    }

}
