package cl.bennu.commons.mapper;

import cl.bennu.commons.domain.base.BaseDomain;
import cl.bennu.commons.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExampleMapper extends BaseMapper<BaseDomain> {

}
