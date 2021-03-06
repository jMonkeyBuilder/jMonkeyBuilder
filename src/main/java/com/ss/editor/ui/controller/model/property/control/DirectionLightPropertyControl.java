package com.ss.editor.ui.controller.model.property.control;

import static com.ss.editor.ui.controller.model.property.control.ModelPropertyControl.newChangeHandler;

import com.jme3.light.Light;
import com.jme3.math.Vector3f;
import com.ss.editor.model.undo.editor.ModelChangeConsumer;
import com.ss.editor.ui.controller.property.impl.AbstractVector3fPropertyControl;

import org.jetbrains.annotations.NotNull;

/**
 * The implementation of the {@link ModelPropertyControl} to edit direction's vector of the {@link Light}.
 *
 * @param <T> the type parameter
 * @author JavaSaBr
 */
public class DirectionLightPropertyControl<T extends Light> extends AbstractVector3fPropertyControl<ModelChangeConsumer, T> {

    /**
     * Instantiates a new Direction light property controller.
     *
     * @param element             the element
     * @param paramName           the param name
     * @param modelChangeConsumer the model change consumer
     */
    public DirectionLightPropertyControl(@NotNull final Vector3f element, @NotNull final String paramName,
                                         @NotNull final ModelChangeConsumer modelChangeConsumer) {
        super(element, paramName, modelChangeConsumer, newChangeHandler());
    }
}
