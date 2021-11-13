package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    //define field for entityManager
    private EntityManager entityManager;

    //constructor injection
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManagerIn) {
        entityManager = entityManagerIn;

    }

    @Override
    public void save(Employee employee) {

        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //save emloyee
        currentSession.saveOrUpdate(employee);

    }

    @Override
    public Employee findById(int id) {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the employee
        Employee employee = currentSession.get(Employee.class, id);

        return employee;
    }

    @Override
    public void deleteByid(int id) {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //delete object with primary key
        Query query = currentSession.createQuery("delete from Employee where id=:employeeId");

        query.setParameter("employeeId", id);

        query.executeUpdate();
    }

    @Override
    public List<Employee> findAll() {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery =
                currentSession.createQuery("from Employee", Employee.class);

        List<Employee> employeeList = theQuery.getResultList();
        return employeeList;
    }
}
