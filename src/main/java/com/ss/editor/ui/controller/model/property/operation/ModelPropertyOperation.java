package com.ss.editor.ui.controller.model.property.operation;

import com.ss.editor.model.undo.editor.ModelChangeConsumer;
import com.ss.editor.model.undo.impl.AbstractEditorOperation;
import com.ss.editor.ui.component.editor.impl.model.ModelFileEditor;
import com.ss.editor.ui.controller.property.operation.AbstractPropertyOperation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The implementation of the {@link AbstractEditorOperation} to edit properties of models in the {@link
 * ModelFileEditor}*.
 *
 * @param <D> the type parameter
 * @param <T> the type parameter
 * @author JavaSaBr
 */
public class ModelPropertyOperation<D, T> extends AbstractPropertyOperation<ModelChangeConsumer, D, T> {

    /**
     * Instantiates a new Model property operation.
     *
     * @param target       the target
     * @param propertyName the property name
     * @param newValue     the new value
     * @param oldValue     the old value
     */
    public ModelPropertyOperation(@NotNull final D target, @NotNull final String propertyName, @Nullable final T newValue,
                                  @Nullable final T oldValue) {
        super(target, propertyName, newValue, oldValue);
    }

    @Override
    protected void redoImpl(@NotNull final ModelChangeConsumer editor) {
        EXECUTOR_MANAGER.addEditorThreadTask(() -> {
            apply(target, newValue);
            EXECUTOR_MANAGER.addFXTask(() -> editor.notifyChangeProperty(null, target, propertyName));
        });
    }

    @Override
    protected void undoImpl(@NotNull final ModelChangeConsumer editor) {
        EXECUTOR_MANAGER.addEditorThreadTask(() -> {
            apply(target, oldValue);
            EXECUTOR_MANAGER.addFXTask(() -> editor.notifyChangeProperty(null, target, propertyName));
        });
    }
}