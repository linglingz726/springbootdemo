package com.offcn.springbootdemo.Controller;


import com.offcn.springbootdemo.pojo.Car;
import org.springframework.web.bind.annotation.*;

import java.util.Date;



@RestController  //相当于Controller+ResponseBody注解
@RequestMapping("/car")
public class CarController {
    /*方法无参数的*/
    @RequestMapping(value = "/getCar1",method = RequestMethod.GET)
    public Car getCar(){
        Car car = new Car(1,"本田",1234.67,new Date());
        return car;
    }

   /*
    //通过路径url传参数的（1、PathVariable（/{}占位符；2、RequestParam（/路径?参数=。。。））
    */
    @RequestMapping(value = "/getCar2/{id}",method = RequestMethod.GET)
    public Car getCar1(@PathVariable("id")Integer id, @RequestParam("name") String name){
       // Car car = new Car(1,"本田",1234.67,new Date());
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setPrice(12345.45);
        car.setCreateTime(new Date());
        return car;
    }

   /*
   //测试lombok的getter和setter，toString，有参无参构造器注解
    // （file-->settings-->plugins搜索lombok安装即可，pom.xml导入依赖）
   */
    @RequestMapping(value = "/getCar3",method = RequestMethod.GET)
    public Car getCar2(){
        Car car = new Car(1,"本田",1234.67,new Date());
        return car;
    }

}
