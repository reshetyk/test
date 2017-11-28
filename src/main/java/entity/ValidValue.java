package entity;

import static entity.WorkflowTransitions.WorkflowTransitionEntry;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
public class ValidValue extends WorkflowEntity{
    private String value;

    public ValidValue(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public WorkflowTransitions getWorkflowTransition() {
        WorkflowTransitionEntry draft = new WorkflowTransitionEntry(WorkflowStatus.DRAFT, WorkflowDecisionStatus.EMPTY);
        return new WorkflowTransitions(
                draft
        );
    }
}
