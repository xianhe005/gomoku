package com.yjx.utils;

/**
 * 常量类
 * Created by yangjinxiao on 2016/7/3.
 */
public class Constants {
    public static final int MAX_LINE = 10;//棋盘的行数
    public static final int WIN_PIECES_NUM = 5;//连成几个子算赢

    public interface SharedPreferenceConstant {
        String PREFERENCE_NAME = "GomokuApp";
    }

    public enum ThemeModel {
        DAY, NIGHT, DOWN;
    }

    public interface ThemeModelStrs {
        String DAY = "日间模式";
        String NIGHT = "夜间模式";
        String DOWN = "傍晚模式";
    }
}