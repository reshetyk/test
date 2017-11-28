package entity;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
public class Decision {

    private WorkflowDecisionStatus status;
    private String reviewerComment;

    public Decision(WorkflowDecisionStatus status, String reviewerComment) {
        this.status = status;
        this.reviewerComment = reviewerComment;
    }

    public WorkflowDecisionStatus getStatus() {
        return status;
    }

    public String getReviewerComment() {
        return reviewerComment;
    }
}
