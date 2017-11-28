package workflow;

import entity.WorkflowEntity;

/**
 * Created by Reshetuyk on 28.11.2017.
 */
public class WorkflowActionSfaActiveReject<T extends WorkflowEntity> extends WorkflowActionAbstract<T> {

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
}
