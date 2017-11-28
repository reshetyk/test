package workflow;

import entity.WorkflowEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
@Service
public abstract class WorkflowActionAbstract<T extends WorkflowEntity> implements WorkflowAction<T>{

    @Autowired
    protected JpaRepository<T, Long> repo;

    @Override
    public void apply(T entity) {
        repo.save(entity);
    }

    @Override
    public void applyAll(Iterable<T> entities) {
        repo.saveAll(entities);
    }

}
