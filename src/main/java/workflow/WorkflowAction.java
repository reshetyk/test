package workflow;

import entity.WorkflowEntity;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
public interface WorkflowAction<T extends WorkflowEntity>  {

    void apply(T entity);

    void applyAll(Iterable<T> entity);

    boolean isApplicableFor (T entity);

}
