/**
 * ==================================================
 * Project: hotel_booking_service
 * Package: top.abigtree.hotel_booking_service.controller
 * =====================================================
 * Title: Example.java
 * Created: [2023/6/23 21:03] by Shuxin-Wang
 * =====================================================
 * Description: description here
 * =====================================================
 * Revised History:
 * 1. 2023/6/23, created by Shuxin-Wang.
 * 2.
 */

package top.abigtree.hotel_booking_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public String example(){
        return "Hello World! This is an example!";
    }
}
