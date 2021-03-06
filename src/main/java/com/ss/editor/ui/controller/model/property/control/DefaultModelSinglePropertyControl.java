package com.ss.editor.ui.controller.model.property.control;

import static com.ss.editor.ui.controller.model.property.control.ModelPropertyControl.newChangeHandler;

import com.ss.editor.model.undo.editor.ModelChangeConsumer;
import com.ss.editor.ui.controller.property.impl.AbstractDefaultSinglePropertyControl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The default implementation of the property controller.
 *
 * @param <D> the type parameter
 * @param <T> the type parameter
 * @author JavaSaBr
 */
public class DefaultModelSinglePropertyControl<D, T> extends AbstractDefaultSinglePropertyControl<ModelChangeConsumer, D, T> {

    /**
     * Instantiates a new Default model single property controller.
     *
     * @param element        the element
     * @param paramName      the param name
     * @param changeConsumer the change consumer
     */
    public DefaultModelSinglePropertyControl(@Nullable final T element, @NotNull final String paramName,
                                             @NotNull final ModelChangeConsumer changeConsumer) {
        super(element, paramName, changeConsumer, newChangeHandler());
    }
}
