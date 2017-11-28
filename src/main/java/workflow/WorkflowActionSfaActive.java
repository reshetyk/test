package workflow;

import entity.WorkflowEntity;
import org.springframework.stereotype.Service;

import static entity.WorkflowDecisionStatus.EMPTY;
import static entity.WorkflowStatus.SFA;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
@Service
public class WorkflowActionSfaActive<T extends WorkflowEntity> extends WorkflowActionAbstract<T> {

    @Override
    public void apply(T entity) {
//        Optional<T> original = repo.findById(entity.getId());
//        entity.setOriginalId(original.get().getId());
//        repo.save(original.get());
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Override
    public void applyAll(Iterable<T> entities) {
        repo.saveAll(entities);
    }

    @Override
    public boolean isApplicableFor(T entity) {
        return entity.getStatus() == SFA && entity.getDecision().getStatus() == EMPTY;
    }
}
