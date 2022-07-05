package cn.syag.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : syag
 * @Date 2022/6/2
 * @note :
 */
public class Lists {

    public static <E> List<E> newArrayList(){
        return new ArrayList();
    }

    public static <E> List<E> newArrayList(E...elements){
        List<E> newList = new ArrayList(getCapacity(elements.length));
        for (E e : elements) {
            newList.add(e);
        }
        return newList;
    }

    private static int getCapacity(int arraySize){
        return 5 + arraySize + (arraySize / 10);
    }

    public <E> boolean isEmpty(ArrayList<E> list){
        if (list==null || list.size()==0){
            return true;
        }
        return false;
    }
}
