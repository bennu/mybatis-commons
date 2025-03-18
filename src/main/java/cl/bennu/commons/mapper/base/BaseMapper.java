package cl.bennu.commons.mapper.base;

import cl.bennu.commons.domain.base.BaseDomain;
import cl.bennu.commons.mapper.base.cqrs.CommanderMapper;
import cl.bennu.commons.mapper.base.cqrs.QueryMapper;

public interface BaseMapper<T extends BaseDomain>
        extends CommanderMapper<T>, QueryMapper<T> {

}
