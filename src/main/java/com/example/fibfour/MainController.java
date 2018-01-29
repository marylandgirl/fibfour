package com.example.fibfour;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String printFibSums(@RequestParam int number) {

        if (number < 5) {
            return number + " " + number + " " + number + " " + number;
        }
        int n1 = number;
        int n2 = number - 1;
        int n3 = number - 2;
        int n4 = number - 3;
        int n5;

        int count = 20;

        System.out.print(n1 + " " + n2 + " " + n3 + " "  +n4 + " ");
        StringBuffer str = new StringBuffer();
        str.append(n1 + " " + n2 + " " + n3 + " "  +n4 + " " );
        for(int i=4;i<count;++i)
        {

            n5 = n1 + n2 + n3 + n4;
            n1=n2;
            n2=n3;
            n3=n4;
            n4=n5;
            System.out.print(" "+n5);
            str.append(" " + n5);
        }

//        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

        return str.toString();

    }
}
