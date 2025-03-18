package cl.bennu.commons.mapper.base.cqrs;

import cl.bennu.commons.domain.base.BaseDomain;

import java.util.List;

public interface QueryMapper<T extends BaseDomain> {

    List<T> getAll();

    List<T> find(T type);

    T get(Long id);

    T getByName(String name);

}
