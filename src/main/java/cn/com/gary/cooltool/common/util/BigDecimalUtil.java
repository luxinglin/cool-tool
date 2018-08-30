package cn.com.gary.cooltool.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 浮点数值计算工具类
 *
 * @author luxinglin
 * @since 2018-08-30
 */
public class BigDecimalUtil {
    private BigDecimalUtil() {
    }

    public static int compare(double d1, double d2) {
        if (round(d1) > round(d2)) {
            return 1;
        } else if (round(d1) == round(d2)) {
            return 0;
        } else {
            return -1;
        }
    }

    public static double getDoubleValue(BigDecimal value) {
        if (value == null) {
            return 0.0;
        } else {
            return value.doubleValue();
        }
    }

    public static int getIntValue(BigDecimal value) {
        if (value == null) {
            return 0;
        } else {
            return value.intValue();
        }
    }

    public static long getLongValue(BigDecimal value) {
        if (value == null) {
            return 0L;
        } else {
            return value.longValue();
        }
    }


    public static double round(double value, int scale) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, BigDecimal.ROUND_HALF_UP);
        double d = bd.doubleValue();
        bd = null;
        return d;
    }

    public static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(3, BigDecimal.ROUND_HALF_UP);
        double d = bd.doubleValue();
        bd = null;
        return d;
    }

    public static double addValue(double d1, double d2) {
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.add(bd2).doubleValue();
    }

    public static double substractValue(double d1, double d2) {
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.subtract(bd2).doubleValue();
    }

    public static double multiplyValue(double d1, double d2) {
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.multiply(bd2).doubleValue();
    }

    public static double divideValue(double d1, double d2) {
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));

        return bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

    public static String getUpdateValue(double value) {
        DecimalFormat df1 = new DecimalFormat("#0.###");
        return df1.format(value);
    }

    public static int getIntValue(double value) {
        double d = round(value, 0);
        return new BigDecimal(d).intValue();
    }

    public static String getUpdateValue(BigDecimal value) {
        if (value == null) {
            value = new BigDecimal(0);
        }
        return getUpdateValue(value.doubleValue());
    }

}
