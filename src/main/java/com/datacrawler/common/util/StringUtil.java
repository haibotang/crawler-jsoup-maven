package com.datacrawler.common.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Arrays;



/**
 * En: The extension class of String utility<br>
 * Jp: 文字列ユーティリティの拡張クラス<br>
 * Zh: 文字列utility扩展类<br>
 * @author bluetata
 */
public class StringUtil {

    /** En: The constant of NULL; Jp: 空文字列を表す定数です。 Zh: 表空文字的常量 */
    public static final String EMPTY = "";
    
    /** En: The collections are used by generateRandomToken(); Jp: generateRandomToken()で使用する文字集合; 被generateRandomToken()使用的文字集合 */
    private static final String RTOKEN_DEFAULT_CHARTABLE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    /** generateRandomToken() で生成する文字列の長さ */
    private static final int RTOKEN_DEFAULT_LEN = 10;

    /** 全角ひらがなの開始文字。 */
    private static final char HIRAGANA_START = '\u3040';

    private static final char HAN_SPACE = ' ';
    private static final char ZEN_SPACE = '　';
    private static final char HAN_ASCII_START = '!';
    private static final char HAN_ASCII_END = '~';
    private static final char ZEN_ASCII_START = '！';
    private static final char ZEN_ASCII_END = '\uff5e';
    private static final char HAN_YEN_SYMBOL = '\\';
    private static final char ZEN_YEN_SYMBOL = '￥';
    private static final char HAN_DIGIT_START = '0';
    private static final char HAN_DIGIT_END = '9';

    /** 半角カタカナの開始文字。 */
    private static final char HAN_KANA_START = '｡';

    /** 半角カタカナの終了文字。 */
    private static final char HAN_KANA_END = 'ﾟ';

    /** 半角カナ→全角カナ変換用のテーブル。 */
    private static final char[] HAN2ZEN_KANA_TABLE = ("。「」、・ヲ" +
            "ァィゥェォャュョッーアイウエオカキクケコ" +
            "サシスセソタチツテトナニヌネノハヒフヘホ" +
            "マミムメモヤユヨラリルレロワン゛゜").toCharArray();

    /** 全角カナ→半角カナ変換用のテーブル。 */
    private static final char[] ZEN2HAN_KANA_TABLE = (
        "  ｧ ｱ ｨ ｲ ｩ ｳ ｪ ｴ ｫ ｵ ｶ ｶﾞｷ ｷﾞｸ " +
        "ｸﾞｹ ｹﾞｺ ｺﾞｻ ｻﾞｼ ｼﾞｽ ｽﾞｾ ｾﾞｿ ｿﾞﾀ " +
        "ﾀﾞﾁ ﾁﾞｯ ﾂ ﾂﾞﾃ ﾃﾞﾄ ﾄﾞﾅ ﾆ ﾇ ﾈ ﾉ ﾊ " +
        "ﾊﾞﾊﾟﾋ ﾋﾞﾋﾟﾌ ﾌﾞﾌﾟﾍ ﾍﾞﾍﾟﾎ ﾎﾞﾎﾟﾏ ﾐ " +
        "ﾑ ﾒ ﾓ ｬ ﾔ ｭ ﾕ ｮ ﾖ ﾗ ﾘ ﾙ ﾚ ﾛ   ﾜ " +
        "    ｦ ﾝ ｳﾞ            ﾞ ﾟ       " +
        "  ｧ ｱ ｨ ｲ ｩ ｳ ｪ ｴ ｫ ｵ ｶ ｶﾞｷ ｷﾞｸ " +
        "ｸﾞｹ ｹﾞｺ ｺﾞｻ ｻﾞｼ ｼﾞｽ ｽﾞｾ ｾﾞｿ ｿﾞﾀ " +
        "ﾀﾞﾁ ﾁﾞｯ ﾂ ﾂﾞﾃ ﾃﾞﾄ ﾄﾞﾅ ﾆ ﾇ ﾈ ﾉ ﾊ " +
        "ﾊﾞﾊﾟﾋ ﾋﾞﾋﾟﾌ ﾌﾞﾌﾟﾍ ﾍﾞﾍﾟﾎ ﾎﾞﾎﾟﾏ ﾐ " +
        "ﾑ ﾒ ﾓ ｬ ﾔ ｭ ﾕ ｮ ﾖ ﾗ ﾘ ﾙ ﾚ ﾛ   ﾜ " +
        "    ｦ ﾝ ｳﾞ    ﾜﾞ    ｦﾞ･ ｰ       "
        ).toCharArray(); 

    /** 全角カタカナの終了文字。 */
    private static final char WIDE_KATAKANA_END = '\u30ff';
    
    /** デフォルト・エンコーディング Windows-31J */
    public static final String DEFAULT_ENCODING = "Windows-31J";
    
}