package com.lhdz.designpattern;

import java.util.Map;

/**
 * Created by 李南 on 2016/1/21  17:10
 * Email:fengyunzhinan@163.com
 */
public class HairFactory {

    /**
     * 通过类的名称来生产对象（把类名已经映射，可直接输入key）
     * @param key
     * @return
     */
    public HairInterface getHairByClassKey(String key)  {
        Map<String,String> map=new PropertiesReader().getProperties();
        try {
            HairInterface hair= (HairInterface) Class.forName(map.get(key)).newInstance();
            return  hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过类名来生产对象
     * @param className
     * @return
     */
    public HairInterface getHairByClassName(String className) {
        try {
            HairInterface hair= (HairInterface) Class.forName(className).newInstance();
            return  hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  null;
    }

    /**
     * 根据类型来创建对象
     * @param key
     * @return
     */
    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }else if("right".equals(key)){
            return  new RightHair();
        }
        return  null;
    }

}
