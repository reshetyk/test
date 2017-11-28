package repository;

import entity.WorkflowEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
interface WorkflowEntityRepository extends CrudRepository<WorkflowEntity, Long> {
}
