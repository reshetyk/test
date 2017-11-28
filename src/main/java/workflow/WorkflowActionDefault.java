package workflow;

import entity.WorkflowEntity;
import org.springframework.stereotype.Service;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
@Service
public class WorkflowActionDefault<T extends WorkflowEntity> extends WorkflowActionAbstract<T>{

    @Override
    public boolean isApplicableFor(T entity) {
        return false;
    }

}
