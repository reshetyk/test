package workflow;

import entity.ValidValue;
import entity.WorkflowStatus;
import org.junit.Test;

public class WorkflowActionTest {

    @Test
    public void applyDraft() throws Exception {
        WorkflowAction<ValidValue> draftWorkflow = WorkflowActionFactory.createFor(WorkflowStatus.DRAFT);
        draftWorkflow.apply(new ValidValue(1L, "value 1"));
        //assert that db table has [ValidValue id="1" originalId="null" decision="null" value="value 1" status="DRAFT"]
    }

    @Test
    public void applyDraftToSfa() throws Exception {
        ValidValue validValue = new ValidValue(1L, "value 1");
        WorkflowAction<ValidValue> sfaWorkflow = WorkflowActionFactory.createFor(WorkflowStatus.SFA);
        sfaWorkflow.apply(validValue);
        //assert that db table has [ValidValue id="1" originalId="null" decision="null" value="value 1" status="SFA"]
    }
}