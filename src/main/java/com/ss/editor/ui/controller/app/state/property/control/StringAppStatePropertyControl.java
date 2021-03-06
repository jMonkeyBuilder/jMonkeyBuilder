package com.ss.editor.ui.controller.app.state.property.control;

import static com.ss.editor.ui.controller.app.state.property.control.AppStatePropertyControl.newChangeHandler;

import com.ss.editor.model.undo.editor.SceneChangeConsumer;
import com.ss.editor.ui.controller.property.AbstractPropertyControl;
import com.ss.editor.ui.controller.property.impl.AbstractStringPropertyControl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The implementation of the {@link AbstractPropertyControl} to edit string values.
 *
 * @param <T> the type parameter
 * @author JavaSaBr
 */
public class StringAppStatePropertyControl<T> extends AbstractStringPropertyControl<SceneChangeConsumer, T> {

    /**
     * Instantiates a new String app state property controller.
     *
     * @param propertyValue  the property value
     * @param propertyName   the property name
     * @param changeConsumer the change consumer
     */
    public StringAppStatePropertyControl(@Nullable final String propertyValue, @NotNull final String propertyName,
                                         @NotNull final SceneChangeConsumer changeConsumer) {
        super(propertyValue, propertyName, changeConsumer, newChangeHandler());
    }
}
