package org.example;

//Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
//              каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник сотрудников

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class EmployeeDirectory {
        private List<Employee> employeeList;
        private AtomicInteger id = new AtomicInteger(0);

        public EmployeeDirectory() {
                this.employeeList = new ArrayList<>();
        }

        public void add(Employee emp){
                emp.setCardId(id.incrementAndGet());
                employeeList.add(emp);
        }

        public List<Employee> getEmpByExpLevel(int expLevel){
                return employeeList.stream()
                        .filter(l -> l.getExpLevel() == expLevel)
                        .collect(Collectors.toList());
        }

        public List<Long> getEmployeePhoneByName(String name){
                List<Long> phoneNumbers = new ArrayList<>();
                List<Employee> empList = employeeList.stream()
                        .filter(employee -> employee.getName().equals(name))
                        .collect(Collectors.toList());
                empList.forEach(e -> phoneNumbers.add(e.getPhone()));
                return phoneNumbers;
        }

        public Employee getEmployeeByCardId(int cardId){
                return employeeList.stream()
                        .filter(e -> e.getCardId()==cardId)
                        .findFirst().get();
        }
}
