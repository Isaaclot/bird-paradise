package task3;

import task3.util.FormatPrinter;

/**
 * 【接口分离原则:客户端不应该被强制依赖它们本不需要使用的接口和方法】
 * 【里氏替换原则:继承必须保证超类的所有非私有属性/行为，在子类中都合理】
 * 1. Bird父类保持鸟类最基本最通用的行为(抽象行为), 鸟类的flying、swimming、buildHouse的行为属于定制化，放在父类中,
 * 通过接口组合实现每种鸟类具备的普遍功能和定制化功能
 * 2. 打印日历的时候，判断某个鸟类是否具备某种行为，通过判断是否实现类某个行为接口来实现
 *
 * @author
 * @since 2020/3/1 10:03 AM
 */
public class Bird {
    public String birdName;

    public Bird() {
    }

    public Bird(String birdName) {
        this.birdName = birdName;
    }

    public String eating(String clock) {
        String action = "eating";
        return FormatPrinter.reportStatus(clock, getBirdName(), action);
    }

    public String walking(String clock) {
        String action = "walking";
        return FormatPrinter.reportStatus(clock, getBirdName(), action);
    }

    public String performing(String clock) {
        String action = "performing";
        return FormatPrinter.reportStatus(clock, getBirdName(), action);
    }

    String getBirdName() {
        return birdName;
    }

}
