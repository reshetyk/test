package entity;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
public abstract class WorkflowEntity {

    protected Long id;
    protected Long originalId;
    protected WorkflowStatus status;
    protected Decision decision;

    public abstract WorkflowTransitions getWorkflowTransition ();

    public Long getOriginalId() {
        return originalId;
    }

    public void setOriginalId(Long originalId) {
        this.originalId = originalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WorkflowStatus getStatus() {
        return status;
    }

    public void setStatus(WorkflowStatus status) {
        this.status = status;
    }

    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
    }
