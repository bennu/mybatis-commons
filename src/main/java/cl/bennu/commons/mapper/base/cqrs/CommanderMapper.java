package cl.bennu.commons.mapper.base.cqrs;

import cl.bennu.commons.domain.base.BaseDomain;

public interface CommanderMapper<T extends BaseDomain> {

    void insert(T type);

    void update(T type);

    void delete(Long id);

}
