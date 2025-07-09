# Hands-on 4: Difference between JPA, Hibernate, and Spring Data JPA

---

## Java Persistence API (JPA)

- JSR 338 Specification for persisting, reading and managing data from Java objects
- Interface-based — does **not contain concrete implementation**
- **Hibernate** is one of the implementations of JPA

---

## Hibernate

- ORM (Object-Relational Mapping) tool that **implements JPA**
- Offers low-level control but **requires more boilerplate code**

---

## Spring Data JPA

- A Spring-based abstraction **on top of JPA**
- Does **not implement JPA**, but simplifies it
- **Reduces boilerplate code** with auto-generated repository methods
- Handles **transactions automatically**

---

## Code Comparison

### Hibernate

```java
/* Method to CREATE an employee in the database */
public Integer addEmployee(Employee employee){
    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try {
        tx = session.beginTransaction();
        employeeID = (Integer) session.save(employee); 
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null) tx.rollback();
        e.printStackTrace(); 
    } finally {
        session.close(); 
    }
    return employeeID;
}
```

### Spring Data JPA

EmployeeRespository.java
```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
```

EmployeeService.java
```java
    @Autowire
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
```