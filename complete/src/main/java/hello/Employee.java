package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


class Employee {

  private String name;
  private String role;

  Employee() {}

  Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }
}