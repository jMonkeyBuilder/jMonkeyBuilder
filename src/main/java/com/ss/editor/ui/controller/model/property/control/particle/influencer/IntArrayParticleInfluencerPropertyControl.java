package com.ss.editor.ui.controller.model.property.control.particle.influencer;

import static com.ss.editor.ui.controller.model.property.control.particle.influencer.ParticleInfluencerPropertyControl.newChangeHandler;

import com.ss.editor.model.undo.editor.ModelChangeConsumer;
import com.ss.editor.ui.controller.property.impl.AbstractIntArrayPropertyControl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import tonegod.emitter.influencers.ParticleInfluencer;

/**
 * The implementation of the {@link AbstractIntArrayPropertyControl} to edit int array values in the {@link
 * ParticleInfluencer}*.
 *
 * @param <T> the type parameter
 * @author JavaSaBr
 */
public class IntArrayParticleInfluencerPropertyControl<T extends ParticleInfluencer>
        extends AbstractIntArrayPropertyControl<ModelChangeConsumer, T> {

    /**
     * Instantiates a new Int array particle influencer property controller.
     *
     * @param element             the element
     * @param paramName           the param name
     * @param modelChangeConsumer the model change consumer
     * @param parent              the parent
     */
    public IntArrayParticleInfluencerPropertyControl(@Nullable final int[] element, @NotNull final String paramName,
                                                     @NotNull final ModelChangeConsumer modelChangeConsumer,
                                                     @NotNull final Object parent) {
        super(element, paramName, modelChangeConsumer, newChangeHandler(parent));
    }
}
