package com.ss.editor.ui.controller.model.tree.action.particle.emitter.shape;

import static com.ss.editor.extension.property.EditablePropertyType.VECTOR_3F;
import com.jme3.effect.ParticleEmitter;
import com.jme3.effect.shapes.EmitterPointShape;
import com.jme3.effect.shapes.EmitterShape;
import com.jme3.math.Vector3f;
import com.ss.editor.Messages;
import com.ss.editor.ui.Icons;
import com.ss.editor.ui.controller.tree.AbstractNodeTree;
import com.ss.editor.ui.controller.tree.node.ModelNode;
import com.ss.editor.ui.dialog.factory.PropertyDefinition;
import com.ss.rlib.util.VarTable;
import com.ss.rlib.util.array.Array;
import com.ss.rlib.util.array.ArrayFactory;
import javafx.scene.image.Image;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The action to create a {@link EmitterPointShape} to the {@link ParticleEmitter}.
 *
 * @author JavaSaBr
 */
public class CreatePointShapeEmitterAction extends AbstractCreateShapeEmitterAction {

    @NotNull
    private static final String PROPERTY_POINT = "point";

    /**
     * Instantiates a new Create point shape emitter action.
     *
     * @param nodeTree the node tree
     * @param node     the node
     */
    public CreatePointShapeEmitterAction(@NotNull final AbstractNodeTree<?> nodeTree,
                                         @NotNull final ModelNode<?> node) {
        super(nodeTree, node);
    }

    @Nullable
    @Override
    protected Image getIcon() {
        return Icons.POINTS_16;
    }

    @NotNull
    @Override
    protected String getName() {
        return Messages.MODEL_NODE_TREE_ACTION_PARTICLE_EMITTER_POINT_SHAPE;
    }

    @NotNull
    @Override
    protected Array<PropertyDefinition> getPropertyDefinitions() {
        final Array<PropertyDefinition> definitions = ArrayFactory.newArray(PropertyDefinition.class);
        definitions.add(new PropertyDefinition(VECTOR_3F, Messages.MODEL_PROPERTY_POINT, PROPERTY_POINT, new Vector3f(1F, 1F, 1F)));
        return definitions;
    }

    @NotNull
    @Override
    protected String getDialogTitle() {
        return Messages.CREATE_PARTICLE_EMITTER_POINT_SHAPE_DIALOG_TITLE;
    }

    @NotNull
    @Override
    protected EmitterShape createEmitterShape(@NotNull final VarTable vars) {
        final Vector3f point = vars.get(PROPERTY_POINT);
        return new EmitterPointShape(point);
    }
}
