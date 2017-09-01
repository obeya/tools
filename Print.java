import java.io.PrintStream;

/**
 * Print类 便捷System.out.print
 * <p>
 * 静态导入 import static tools.Print.*;
 *
 * @author 李锋
 * @version 1.0 2016-10-02
 */
public class Print {

    /**
     * 换行 输出
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * 换行
     */
    public static void print() {
        System.out.println();
    }

    /**
     * 不换行输出
     */
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    /**
     * 格式化输出
     */
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}