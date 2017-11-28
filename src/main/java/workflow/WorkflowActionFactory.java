package workflow;

import entity.WorkflowEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
@Service
public class WorkflowActionFactory {

    @Autowired
    private List<WorkflowAction> workflowActions;

    @Autowired
    private WorkflowActionDefault workflowActionDefault;

    //todo: check on startup are any conflicts in the isApplicableFor method??

    public <T extends WorkflowEntity> WorkflowAction<T> createFor(final T entity) {
        //todo: assure that only one matching (or log??)

        return workflowActions.stream()
                .filter(w -> w.isApplicableFor(entity))
                .findFirst()
                .orElseGet(() -> workflowActionDefault); //todo: log that default impl was returned!

    }

}
