package com.example.zeyin.learnTotal.service;

import com.example.zeyin.learnTotal.Mapper.TableMapper;
import com.example.zeyin.learnTotal.TableService;
import com.example.zeyin.learnTotal.method.TableMethod;
import com.example.zeyin.learnTotal.pojo.Employee;
import com.example.zeyin.learnTotal.pojo.EmployeeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 15:27
 * @Modify:
 */
@Service
public class TableServiceImpl implements TableService {
    /**
     * 常量不适用注解Autowired
     */
    private int count = 1;

    @Autowired
    private TableMapper tableMapper;

    @Override
    public void chkTable() {
        //集合判空
        List<String> list = new ArrayList<>();
        CollectionUtils.isEmpty(list);

        //String判空
        StringUtils.isEmpty("");

        //Map容器的值为对象时，修改值后不用再put
        Map<String, Employee> map = new HashMap<>();
        Employee zeyin = map.get("张三");
        zeyin.setAge(13);

        //获取某个字段的最大值
        List<Employee> employeeList = new ArrayList<>();
        int MaxAge = employeeList.stream()
                .filter(item -> item.getAge() > 0)
                .map(Employee::getAge)
                .distinct()
                .max(Comparator.naturalOrder())
                .orElse(0);

        //批量获取某个链表中对象的某个字段，组成新的链表
        List<String> nameList = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        //map用法
        for (Map.Entry<String, Employee> tempMap : map.entrySet()) {
            //
        }
        //Map值转换成list
        List<Employee> tempList = new ArrayList<>(map.values());

        //list转map
        Map<String, Employee> tempMap1 = tempList.stream()
                .collect(Collectors.toMap(Employee::getName, Employee -> Employee));

        //过滤链表中的部分数据
        List<Employee> tempList2 = tempList.stream()
                .filter(item -> EmployeeEnum.Name1.getName().equals(item.getName()))
                .collect(Collectors.toList());

        //foreach用法
        tempList.forEach(TableMethod::chkTableMethod);

        //list升序排列
        tempList = tempList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());

        //正则用法(与...相符合)
        if (Pattern.matches("^"
                + EmployeeEnum.Name1.getName() + "|"
                + EmployeeEnum.Name2.getName() + "$", tempList.get(0).getName())) {
            return;
        }


        //List<List<T>>转换成List<T>
        List<List<Employee>> employeeLists = new ArrayList<>();
        List<Employee> employeeList1 = employeeLists.stream()
                .collect(ArrayList::new, ArrayList::addAll, ArrayList::addAll);


        //并发处理
/*        List<Object> collect = map.keySet()
                .parallelStream()
                .map(TableMethod::chkTableMethod)
                .collect(Collectors.toList());*/


    }

    /**
     * @Description: 泛型使用
     * @Author: zeyin
     * @Date: 2021/2/25 16:02
     */
    @Override
    public <T, Z> List<Z> getNameList(Class<T> tClass, Class<Z> zClass) {
        List<Z> resList = new ArrayList<>();
        return resList;
    }
}
