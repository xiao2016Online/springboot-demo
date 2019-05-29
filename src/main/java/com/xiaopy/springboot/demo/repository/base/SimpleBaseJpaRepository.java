package com.xiaopy.springboot.demo.repository.base;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.Optional;

public class SimpleBaseJpaRepository<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    @PersistenceContext
    private final EntityManager entityManager;

    private  Class<T> domainClass;

    public SimpleBaseJpaRepository(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.domainClass = domainClass;
        this.entityManager = em;
    }


    @Override
    public T get(ID serializable) {
        T result=null;
        Optional<T> optional = findById(serializable);
        if(optional.isPresent()){
            result =optional.get();
        }
        return result;
    }
}
